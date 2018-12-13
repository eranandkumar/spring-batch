package com.anand.spring;

public class Hello {
	
	private A aobj;
	private B bobj;

	public Hello(B bobj) {
		System.out.println("Hello Class Cons - 1-args");
		this.bobj = bobj;
	}
	
	public void setAobj(A aobj) {
		//System.out.println("Hello - setObj");
		this.aobj = aobj;
	}
	
	public void show() {
		aobj.showA();
		bobj.showB();
	}
}
