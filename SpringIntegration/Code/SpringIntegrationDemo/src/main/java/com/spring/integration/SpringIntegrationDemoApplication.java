package com.spring.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationDemoApplication implements ApplicationRunner{//implements ApplicationRunner  {
	
	@Autowired
	private CustomGateway gateway;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationDemoApplication.class, args);
		System.out.println("Spring Boot Application Statrter");
		
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		gateway.test("Spring Integration Demo ****************************");
		
	}
}
