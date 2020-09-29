package com.demo.inner;

class OuterClass {
	static int x = 20;
	
	static class InnerClass {
		static int y = 30;
		
		static void display() {
			System.out.println("Outer x : " + x);
		}
	}
}

public class StaticNestedTestClass {
	public static void main(String[] args) {
		OuterClass.InnerClass.display();
		System.out.println(OuterClass.InnerClass.y);
	}	
}