package com.test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		//Auto-boxing : int to Integer
		list.add(5);
		list.add(10);
		
		//Unboxing : Integer to int
		int a = list.get(0);
		
		System.out.println(a);
	}

}