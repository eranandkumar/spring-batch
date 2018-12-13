package com.spring.service;

public class LogService {
	
	public void logBefore() {
		System.out.println(" << LS - logBefore");
	}
	
	public void logReturning() {
		System.out.println(" << LS - logReturning");
	}
	
	public void logThrowingException(Exception e) {
		System.out.println(" << LS - logThrowingException");
		System.out.println(e);
	}
}
