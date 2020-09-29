package com.string;

public class Demo {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		if(sb1.equals(sb2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
	}

}
