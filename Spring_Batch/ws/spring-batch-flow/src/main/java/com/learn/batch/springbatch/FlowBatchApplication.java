package com.learn.batch.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan(value="com.learn.batch")
public class FlowBatchApplication {

	/*
	 * Still now we created our job having different steps
	 * behind the scene Spring batch Taken all the Steps and assemble in FLow that is executed by the Job.
	 * 
	 * Flow is a collection of Steps. Spring batch allow us to create our own FLOW explicitly to use as reusable component.
	 * These can be used to reuse configuration from job to job within Job.
	 * For example lets say i have initialization process i want to run it beginning of each job.
	 * 1. It send Email 2. Initialize the database 3. write something in log file.
	 * So i can encapsulate these 3 steps into a flow and append that in each job, instead of copying these configuration steps in each job.
	 * 
	 */
	
	
	public static void main(String[] args) {
		SpringApplication.run(FlowBatchApplication.class, args);
	}

}

