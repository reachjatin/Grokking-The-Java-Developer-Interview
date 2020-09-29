package com.tech;

abstract class MyAbstractClass {

	public int a;
	public int b;
	
	public MyAbstractClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
}

public class AbstractDemo extends MyAbstractClass {
	
	public AbstractDemo(int x, int y) {
		super(x, y);
		
	}
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo(5, 10);
		obj.print();
	}
	
}