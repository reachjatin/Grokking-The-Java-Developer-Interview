package com.tech;

import java.io.IOException;

public class DemoException {

	public static void method1() {
		throw new IOException("IO Exception occurred");
	}
	
	public static void main(String[] args) {

		method1();
		
	}

}