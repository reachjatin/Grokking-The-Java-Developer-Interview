package com.singleton.demo;

public class A {

	private A() { }
	
	public static final A instance = new A();
	
}