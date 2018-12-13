package com.spring.integration;

import java.util.Map;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class PrintService {
	public Message<?> printMsg(Message msg) {
		MessageHeaders mh = msg.getHeaders();
		
		for(Map.Entry<String, Object> entry : mh.entrySet() ) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(msg.getPayload());
		return MessageBuilder.withPayload("New Message TO Retunr").build();
	}
}
