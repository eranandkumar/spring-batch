package com.learn.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.retry.annotation.Backoff;

/**
 * @author AnandKumar
 *
 */
@Configuration
@EnableBatchProcessing
public class StepTransitionConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
    public Step step1(){
        return stepBuilderFactory.get ( "step1" )
                .tasklet ( new Tasklet () {
                    @Override
                    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
                        System.out.println (">>>>>>>> This is Step1");
                        return RepeatStatus.FINISHED;
                    }
                } ).build ();
    }
    
    @Bean
    public Step step2() {
    		return stepBuilderFactory.get("step2")
    				.tasklet((stepContribution, chunkContext) ->{
    					System.out.println(">>>>>>>> This is Step2");
    					return RepeatStatus.FINISHED;
    				}).build();
    }
    
    public Step step3() {
    		return stepBuilderFactory.get("step3")
    				.tasklet((stepContribution, chunkContext)->{
    					System.out.println(">>>>>>>> This is Step3");
    					return RepeatStatus.FINISHED;
    				}).build();
    				
    }

    /*
    @Bean
    public Job transitionJob(){
        return jobBuilderFactory.get ( "transitionJob" )
                .start ( step1 () )
                .next(step2())
                .next(step3())
                .build ();
    }*/
    
    @Bean
    public Job conditionalJobExecution(){
        return jobBuilderFactory.get ( "conditionalJobExecution" )
                .start ( step1 () )
                //COMPLETED is Batch Exit code, Spring Batch Provide 2 Status code
                //1. Status code :Its a finite number which Batch will understand.
                //2  Exit Status/Code : Its is use to dectet what transition is going to perform next.
                //in this line we are saying On completion of step1 go to step2
                .on("COMPLETED").to(step2())
                //in below line we are saying from Step 2 completion goto step3
                .from(step2()).on("COMPLETED").to(step3())
                .from(step3())
                //end() is one of the 3 TerminalState Provided by SPring batch.
                //end() is programmatic way of indicating that step is completed successfully/ job is executed successfully
                //fail () --> it indicates job is failed and then stopped
                //stop() --> it indicates we are just programmatically stopping the execution, here is nothing wrong happened, 
                //stop provides additional value which allow to configure from where to restart.
                //2. fail() 3. stop() means Job is not completed and it can be restarted at given point.
                
                //3 Terminal States Are :- 1. end() 2. fail() 3. stop()
                
                .end()
                .build ();
    }
}
