package com.anand.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1Main {
	private static final Logger LOGGER = Logger.getLogger(Lab1Main.class);
	public static void main(String[] args) {
		LOGGER.info("Inside Main");
		System.out.println("Hello world");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringContext.xml");
		
		A objA1 = (A)ctx.getBean("aobj");
		A objA2 = (A)ctx.getBean("aobj");
		B objB1 = (B)ctx.getBean("bobj");
		B objB2 = (B)ctx.getBean("bobj");
		Hello objH = (Hello)ctx.getBean("hello");
		System.out.println(objA1);
		System.out.println(objA2);
		System.out.println(objB1);
		System.out.println(objB2);
	}
}
