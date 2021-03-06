package com.exception;

class Parent {
	public void hello() {
		System.out.println("Parent class hello method");
	}
}

class Child extends Parent {
	public void hello() throws ArithmeticException{
		System.out.println("Child class hello method");
	}
}

public class TestException {
	public static void main(String[] args) {
		Parent p = new Child();
		p.hello();
	}
}