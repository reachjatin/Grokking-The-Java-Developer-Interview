package com.singleton.demo;

public class A {

	//private constructor
	private A() { }
	
	//only instance of this class
	private static final A instance = new A();
	
	//public static method to return the only instance
	public static A getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton class print method");
	}
}