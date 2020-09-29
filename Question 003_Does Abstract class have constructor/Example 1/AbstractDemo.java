package com.tech;

abstract class MyAbstractClass {

	public MyAbstractClass() {
		System.out.println("inside MyAbstractClass constructor");
	}
	
}

public class AbstractDemo extends MyAbstractClass {
	
	public AbstractDemo() {
		System.out.println("inside AbstractDemo constructor");
	}
	
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo();
	}
	
}