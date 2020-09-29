package com.singleton.demo;

public class A {

	private A() { }
	
	private static volatile A instance;

	public static A getInstance() {
		A localRef = instance;
		if(localRef == null) {
			synchronized (A.class) {
				localRef = instance;
				if(localRef == null) { 
					instance = localRef = new A();		
				}
			}
		}
		return localRef;
	}
}