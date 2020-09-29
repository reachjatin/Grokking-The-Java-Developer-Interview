package com.serialization.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable {
	int x;
	public Parent(int x) {
		this.x = x;
	}
}

class Child extends Parent {
	int y;
	public Child(int x, int y) {
		super(x);
		this.y = y;
	}
	private void writeObject(ObjectOutputStream oos) throws IOException {
	  throw new NotSerializableException("Serialization is not supported on this object");
	}
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
	  throw new NotSerializableException("Serialization is not supported on this object");
	}
}

public class TestSerialization {
	public static void main(String[] args) {
		Child child = new Child(5,25);
		System.out.println("x : " + child.x);
		System.out.println("y : " + child.y);
		String file = "C:\\temp\\child3.ser";
		
		serializeObject(file, child);
		deserializeObject(file);			
	}
	
	private static void serializeObject(String file, Child child) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);			
			oos.writeObject(child);
			
			fos.close();
			oos.close();		
			System.out.println("The object has been serialized");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	private static void deserializeObject(String file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Child child1 = (Child) ois.readObject();
			
			fis.close();
			ois.close();
			System.out.println("The object has been deserialized");
			System.out.println("x : " + child1.x);
			System.out.println("y : " + child1.y);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}
	}
}