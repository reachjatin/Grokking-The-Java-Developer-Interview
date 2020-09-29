package com.demo.inner;

class Parent {
	public void display() {
		System.out.println("display method in parent class");
	}
}

public class TestAnonymousInner {

	public static void main(String[] args) {

		Parent p = new Parent() {
			static final int a = 10;
			static int b = 50;
			public void display() {
				System.out.println("display method in anonymous inner class");
			}
		};
		
		p.display();
	}
}
