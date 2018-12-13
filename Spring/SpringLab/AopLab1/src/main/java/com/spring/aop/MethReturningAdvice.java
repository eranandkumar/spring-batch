package com.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.service.LogService;
import com.spring.service.TxService;

public class MethReturningAdvice implements AfterReturningAdvice {

	@Autowired
	LogService ls = null;
	
	@Autowired
	TxService ts = null;
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		ts.commit();
		ls.logReturning();
	}
}
