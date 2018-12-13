package com.anand.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1Main {
	private static final Logger LOGGER = Logger.getLogger(Lab1Main.class);
	public static void main(String[] args) {
		LOGGER.info("Inside Main");
		System.out.println("Hello world");
		//A aobj = new A();
		//aobj.setA(10000);
		//aobj.setMsg("A Class String msz");
		//aobj.showA();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//System.out.println(ctx);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		Hello h1 = (Hello)ctx.getBean("hello1");
		Hello h2 = (Hello)ctx.getBean("hello2");
		h1 = null;
		if(h1 == h2) {
			System.out.println("Both are Equal");
			LOGGER.info(h1);
			LOGGER.info(h2);
			//h.show();
		}else {
			System.out.println("Not Equal");
			LOGGER.info(h1);
			LOGGER.info(h2);
		}
	}
}
