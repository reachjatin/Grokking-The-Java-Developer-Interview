package com.singleton.demo;

public class A {

	private A() { }
	
	private static A instance;

	public synchronized static A getInstance() {
		if(instance == null) {
			instance = new A();
		}
		return instance;
	}
}