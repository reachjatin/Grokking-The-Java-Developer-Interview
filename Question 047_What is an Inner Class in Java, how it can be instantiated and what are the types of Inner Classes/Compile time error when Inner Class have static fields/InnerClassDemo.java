package com.demo.inner;

class OuterClass {
	
	class InnerClass {
		static int inner_x = 20;
		
		static void print() {
			
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