package com.exception;

import java.io.IOException;

class Parent {
	public void hello() {
		System.out.println("Parent class hello method");
	}
}

class Child extends Parent {
	public void hello() throws IOException{
		System.out.println("Child class hello method");
	}
}

public class TestException {
	public static void main(String[] args) {
		
	}
}