package com.anand.spring;

public class Hello {
	
	private A aobj;
	private B bobj;

	public void setAobj(A aobj) {
		System.out.println("Hello - setObj");
		this.aobj = aobj;
	}
	
	public Hello(B bobj) {
		System.out.println("Hello Cons - 1-args");
		this.bobj = bobj;
	}
	
	public void show() {
		aobj.showA();
		bobj.showB();
	}
}
