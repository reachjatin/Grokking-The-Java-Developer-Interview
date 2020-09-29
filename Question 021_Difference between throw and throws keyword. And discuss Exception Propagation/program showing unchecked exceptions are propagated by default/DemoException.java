package com.tech;

public class DemoException {

	public static void method1() {
		method2();
	}
	
	public static void method2() {
		throw new ArithmeticException("Arithmetic Exception from method2");
	}
	
	public static void main(String[] args) {
		method1();
	}
	
}


