package com.singleton.demo;

public class A {

	private A() { }
	
	private static class InnerA {
		private static final A instance = new A();
	}

	public static A getInstance() {
		return InnerA.instance;
	}
}