package com.demo.inner;

class OuterClass {
	static int outer_x = 10;
	int outer_y = 20;
	private int outer_z = 30;
	
	class InnerClass {
		void print() {
			System.out.println("outer_x : " + outer_x);
			System.out.println("outer_y : " + outer_y);
			System.out.println("outer_z : " + outer_z);
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		
		innerClass.print();
	}	
}