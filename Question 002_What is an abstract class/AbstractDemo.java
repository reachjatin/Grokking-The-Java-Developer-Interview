package com.tech;

abstract class MyAbstractClass {

	//abstract method
	abstract void print();
	
	//concrete method
	public void display() {
		System.out.println("In display method");
	}
	
}

public class AbstractDemo extends MyAbstractClass {
	
	@Override
	void print() {
		System.out.println("In print method");
	}
	
	public static void main(String[] args) {
		AbstractDemo obj = new AbstractDemo();
		obj.print();
		obj.display();
	}
	
}