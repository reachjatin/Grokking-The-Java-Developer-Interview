package com.demo.inner;

class OuterClass {
	
	public void print() {
		int print_j = 10;
		final int print_k = 20;
		
		class Inner {
			public void display() {
				print_j = 50;
			}
		}
		
		Inner inner = new Inner();
		inner.display();
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		outerClass.print();
	}	
}



