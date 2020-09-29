package com.singleton.demo;

public class Test {
	public static void main(String[] args) {
		A obj = A.getInstance();
		obj.print();
	}
}