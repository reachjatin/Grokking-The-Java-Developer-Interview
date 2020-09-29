package com.test;

public class Test {

	//instance variables
	String name = "Mike";
	int age = 15;
	
	public void display() {
		//local variables
		String name = "John";
		int age = 20;
					
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.display();
	}

}