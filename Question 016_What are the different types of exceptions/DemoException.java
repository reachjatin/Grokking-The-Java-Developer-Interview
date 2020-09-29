package com.tech;

import java.io.FileReader;

public class DemoException {

	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("C:\\temp\\dummy.txt");
		} finally {
			System.out.println("Inside finally block");
		}
		
	}

}