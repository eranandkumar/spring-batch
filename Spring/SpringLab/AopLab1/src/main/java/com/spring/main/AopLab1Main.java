package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.AccountService;
import com.spring.service.CustomerService;

public class AopLab1Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringContext.xml");
		System.out.println("***** - Using Target Object-*****");
		CustomerService cst = (CustomerService)ctx.getBean("csTarget");
		cst.addCustomer();
		cst.updateCustomer();
		System.out.println("<<<<<<<<####$$$$$$$$$$$$$>>>>>>>>>>>>>>");
		AccountService ast = (AccountService)ctx.getBean("asTarget");
		ast.myDeposit();
		ast.getBal();
		try {
			ast.myWithdraw();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("<<<<<<<<*** With AOP ******>>>>>>>>>>>>>>");
		CustomerService csp = (CustomerService)ctx.getBean("csProxy");
		csp.addCustomer();
		csp.updateCustomer();
		
	}
}
