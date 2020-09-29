package com.tech;

public class DemoException {
	
	public static void method1() {
		int a = 10/0;
	}
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}	
	}
	
}


