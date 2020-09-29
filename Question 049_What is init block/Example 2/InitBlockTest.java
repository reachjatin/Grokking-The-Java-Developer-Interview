package com.test;

class Parent {
	{
		System.out.println("Parent class init block 1");
	}
	
	public Parent() {
		System.out.println("Parent constructor called");
	}
	
	{
		System.out.println("Parent class init block 2");
	}
}

class Child extends Parent {
	{
		System.out.println("Child class init block 1");
	}
	
	public Child() {
		System.out.println("Child constructor called");
	}
	
	{
		System.out.println("Child class init block 2");
	}
}

public class InitBlockTest {

	public static void main(String[] args) {
		new Child();
	}

}
