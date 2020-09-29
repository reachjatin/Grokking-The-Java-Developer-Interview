package com.test;

public class Test {

	public void print(int a, long b) {
		System.out.println("Method 1");
	}
	
	public void print(long a, int b) {
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.print(5, 10);
	}

}