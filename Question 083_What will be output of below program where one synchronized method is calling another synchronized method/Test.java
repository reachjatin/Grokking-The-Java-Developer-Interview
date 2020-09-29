package com.multithreading.demo;

class Demo {
	public synchronized void m1() {
		m2();
		System.out.println("inside m1()");
	}
	
	public synchronized void m2() {
		m3();
		System.out.println("inside m2()");
	}
	
	public synchronized void m3() {
		System.out.println("inside m3()");
	}
}

public class Test {
	public static void main(String[] args) {
		Demo d1 = new Demo();

		d1.m1();
	}
}