package com.learn.batch.springbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan(value="com.learn.batch")
public class FlatFileReaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlatFileReaderApplication.class, args);
	}

}

