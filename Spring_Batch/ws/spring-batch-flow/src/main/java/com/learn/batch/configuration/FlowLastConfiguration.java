package com.learn.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author AnandKumar
 *
 */
@Configuration
public class FlowLastConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
	public Step flowlastConfigCustomStep() {
		return stepBuilderFactory.get("flowlastConfigCustomStep")
				.tasklet((stepContribution, chunkContext) -> {
					System.out.println("$$$$$$$$$$$ This is flowlastConfigCustomStep");
					return RepeatStatus.FINISHED;
				}).build();

	}
    
    @Bean
    public Job flowLastJob(Flow flow) {
    		return jobBuilderFactory.get("flowLastJob")
    				.start(flowlastConfigCustomStep())
    				.on("COMPLETED").to(flow)
    				.end().build();
    }
 
}
