package com.spring.aop;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.service.LogService;
import com.spring.service.TxService;

public class MethodThrowAdvice implements ThrowsAdvice{

	@Autowired
	LogService ls = null;
	
	@Autowired
	TxService ts = null;
	
	public void afterThrowing(Exception e) {
		ts.rollback();
		ls.logThrowingException(e);
	}
}
