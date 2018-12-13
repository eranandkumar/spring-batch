package com.anand.spring;

public class B {

	private int b;
	private String str;
	
	public B(int a, String str) {
		System.out.println("B-Const-2Args");
		this.b = b;
		this.str = str;
	}
	
	public void showB() {
		System.out.println("B- showB()");
		System.out.println(b);
		System.out.println(str);
	}
}
