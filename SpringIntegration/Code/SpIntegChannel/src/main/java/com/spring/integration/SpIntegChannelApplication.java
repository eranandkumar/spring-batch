package com.spring.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpIntegChannelApplication implements ApplicationRunner{

	@Autowired
	@Qualifier("inputChannel")
	DirectChannel inputChannel;
	
	@Autowired
	@Qualifier("outputChannel")
	DirectChannel outputChannel;
	
	public static void main(String[] args) {
		SpringApplication.run(SpIntegChannelApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(inputChannel);
		System.out.println(outputChannel);
		
		//Below Code Snippet is for Without using ServiceActivator
		/*channel.subscribe(new MessageHandler(){

			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				new PrintService().printMsg((Message<String>)message);
			}
			
		});*/
		
		outputChannel.subscribe(new MessageHandler(){
			
			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				System.out.println(message.getPayload());
				
			}
		});
		Message message = MessageBuilder.withPayload("******************Message Builder Payload******************").
				setHeader("BuilderKey", "BuilderValue").build();
		inputChannel.send(message);
		
		
	}
}
