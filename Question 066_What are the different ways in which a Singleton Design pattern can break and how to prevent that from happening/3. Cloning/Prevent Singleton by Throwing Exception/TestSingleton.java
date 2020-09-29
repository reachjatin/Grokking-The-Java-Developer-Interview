package com.singleton.demo;

class Parent implements Cloneable {
	int x = 20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Singleton extends Parent {
	public static final Singleton instance = new Singleton();
	
	private Singleton() { }
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
}

public class TestSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton instance1 = Singleton.instance;
		Singleton instance2 = (Singleton) instance1.clone();
		
		System.out.println("Instance1 hashcode : " + instance1.hashCode());
		System.out.println("Instance2 hashcode : " + instance2.hashCode());
		
	}
}