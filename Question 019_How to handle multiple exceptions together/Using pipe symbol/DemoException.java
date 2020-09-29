package com.tech;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoException {

	public static void main(String[] args) {

		try {
			FileReader f = new FileReader("C:\\temp\\dummy.txt");
		} catch (FileNotFoundException | NullPointerException e ) {
			System.out.println("Same action for both");
		}  finally {
			System.out.println("Inside finally block");
		}
		
	}

}