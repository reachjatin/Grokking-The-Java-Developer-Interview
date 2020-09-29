package com.singleton.demo;

public class A {

	private A() { }
	
	private static A instance;

	public static A getInstance() {
		if(instance == null) {
			synchronized (A.class) {
				if(instance == null) { 
					instance = new A();		
				}
			}
		}
		return instance;
	}
}