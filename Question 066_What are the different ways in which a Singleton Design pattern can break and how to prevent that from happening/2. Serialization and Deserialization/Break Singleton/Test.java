package com.singleton.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {

		A instance1 = A.instance;
		A instance2 = null;
		String file = "C:\\temp\\object.ser";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);			
			oos.writeObject(instance1);

			fos.close();
			oos.close();	
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			instance2 = (A) ois.readObject();
			
			fis.close();
			ois.close();
		} catch (Exception e) {
			System.out.println("Exception occurred");
		}
		
		System.out.println("Instance1 hashcode : " + instance1.hashCode());
		System.out.println("Instance2 hashcode : " + instance2.hashCode());
	}
}