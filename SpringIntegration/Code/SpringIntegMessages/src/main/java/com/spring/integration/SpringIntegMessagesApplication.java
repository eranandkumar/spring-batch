package com.spring.integration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
public class SpringIntegMessagesApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegMessagesApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		/*
		 * Map<String, Object> map = new HashMap<>(); map.put("Custom Key",
		 * "CustomValue"); MessageHeaders msgHed = new MessageHeaders(map);
		 * Message<String> message = new
		 * GenericMessage<>("**************Hello World *******", msgHed);
		 */

		/*
		 * The Above Code for Setting Message Payload and adding Header we can do with
		 * Builder.Below is the Snippet.
		 */

		Message message = MessageBuilder.withPayload("******************Message Builder Payload******************").
				setHeader("BuilderKey", "BuilderValue").build();
		PrintService ps = new PrintService();
		ps.printMsg(message);
	}
}
