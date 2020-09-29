package com.demo.inner;

class OuterClass {
	int a = 10;
	static int b = 20;
	private static int c = 30;
	
	static class InnerClass {
		void print() {
			System.out.println("Outer class variable a : " + a);
			System.out.println("Outer class variable b : " + b);
			System.out.println("Outer class variable c : " + c);
		}
	}
}

public class StaticNestedTestClass {
	public static void main(String[] args) {
		OuterClass.InnerClass innerClassObject = new OuterClass.InnerClass();
		innerClassObject.print();
	}	
}