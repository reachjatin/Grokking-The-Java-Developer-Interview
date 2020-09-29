package com.tech;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}

public class DemoException {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program end");
	}
	
	public static void method1() throws MyException {
		throw new MyException("My own custom exception");
	}
}