package com.learn.batch.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.learn.batch")
public class TransitionBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransitionBatchApplication.class, args);
	}

}

