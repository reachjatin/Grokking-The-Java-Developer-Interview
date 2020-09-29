package com.serialization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		Employee emp = new Employee("John", 20, 31000);
		String file = "C:\\temp\\emp.ser";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);			
			oos.writeObject(emp);

			fos.close();
			oos.close();			
			System.out.println("Employee object is serialized : " + emp);
		} catch (IOException e1) {
			System.out.println("IOException is caught");
		}	
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp1 = (Employee) ois.readObject();
			
			fis.close();
			ois.close();
			System.out.println("Employee object is de-serialized : " + emp1);
		} catch (IOException e) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException is caught"); 
		}
	}
}