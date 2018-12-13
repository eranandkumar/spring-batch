package com.spring.integration;

import java.util.Map;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class PrintService {
	public void printMsg(Message<String> msg) {
		MessageHeaders mh = msg.getHeaders();
		
		for(Map.Entry<String, Object> entry : mh.entrySet() ) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		System.out.println(msg.getPayload());
	}
}
