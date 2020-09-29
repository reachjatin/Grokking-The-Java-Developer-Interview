package com.singleton.demo;

public class A {
	
	private A() { }
	
	private static A instance;
	
	static {
		try{
			instance = new A();
		} catch (Exception e) {
			throw new RuntimeException("Exception while creating singleton object");
		}
	}

	public static A getInstance() {
		return instance;
	}
}