package com.singleton.demo;

public class A {

	private A() { 
		if(A.instance != null) {
			throw new InstantiationError("This object creation is not allowed");
		}
	}
	
	public static final A instance = new A();
	
}