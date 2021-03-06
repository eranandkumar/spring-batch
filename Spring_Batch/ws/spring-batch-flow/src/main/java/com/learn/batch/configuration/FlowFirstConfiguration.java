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
public class FlowFirstConfiguration {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;


    @Bean
	public Step flowFirstConfigCustomStep() {
		return stepBuilderFactory.get("flowFirstConfigCustomStep")
				.tasklet((stepContribution, chunkContext) -> {
					System.out.println("$$$$$$$$$$$ This is flowFirstConfigCustomStep");
					return RepeatStatus.FINISHED;
				}).build();

	}
    
    @Bean
    public Job flowFirstJob(Flow flow) {
    		return jobBuilderFactory.get("flowFirstJob")
    				.start(flow)
    				.next(flowFirstConfigCustomStep())
    				.end().build();
    }
 
}
