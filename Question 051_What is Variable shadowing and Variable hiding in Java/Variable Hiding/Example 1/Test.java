package com.test;

class ParentClass {
	String x = "Parent's x";
	
	public void print() {
		System.out.println(x);
	}
}

class ChildClass extends ParentClass {
	String x = "Child's x";
	
	public void print() {
		System.out.println(x);
	}
}

public class Test {

	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		obj.print();
	}

}