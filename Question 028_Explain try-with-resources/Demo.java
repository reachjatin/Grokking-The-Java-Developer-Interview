package com.exception;

import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("C:\\temp\\dummy.txt");){
			
			//program statements
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
