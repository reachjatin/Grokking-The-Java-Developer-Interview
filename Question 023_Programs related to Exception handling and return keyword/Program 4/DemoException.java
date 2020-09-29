package com.tech;

public class DemoException {

	public static int method1() {
		try {
			int a = 15/0;
			return 1;
		} catch(Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		int result = method1();
		System.out.println(result);
	}

}