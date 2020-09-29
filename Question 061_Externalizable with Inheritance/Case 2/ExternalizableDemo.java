package com.externalizable.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {
	public static void main(String[] args) {
		Student st = new Student();
		st.setStudentId(1);
		st.setStudentName("Lisa");
		st.setAge(20);	
		st.setDeptId(10);
		st.setDeptName("IT");
		st.setCapacity(60);
		String file = "C:\\temp\\object2.ser";
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);			
			oos.writeObject(st);
			fos.close();
			oos.close();		
			System.out.println("Student object is serialized : \n" + st);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student st1 = (Student) ois.readObject();		
			fis.close();
			ois.close();
			System.out.println("Student object is de-serialized : \n" + st1);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
