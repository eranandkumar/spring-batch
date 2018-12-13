package com.spring.service;

public class AccountService {

	public void getBal() {
		System.out.println("getBal - begin");
		System.out.println("getBal - done");
		System.out.println("getBal - end");
	}
	
	public void myDeposit() {
		System.out.println("myDeposit - begin");
		System.out.println("myDeposit - done");
		System.out.println("myDeposit - end");
	}
	
	public void myWithdraw() throws Exception{
		System.out.println("withdraw - begin()");
		if(1 == 1) {
			throw new InsuficientFundException();
		}
		System.out.println("withdraw - end");
	}
}
