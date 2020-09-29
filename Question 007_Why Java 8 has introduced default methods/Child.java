package com.tech;

interface Interface1 {
	default void hello() {
		System.out.println("Hello from Interface1");
	}
}

interface Interface2 {
	default void hello() {
		System.out.println("Hello from Interface2");
	}
}

public class Child implements Interface1, Interface2 {
	@Override
	public void hello() {
		System.out.println("inside Child class hello method");
		Interface1.super.hello();
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.hello();
	}
}