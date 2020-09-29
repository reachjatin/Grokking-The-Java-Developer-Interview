package com.singleton.demo;

public enum SingletonEnum {

	INSTANCE;
	
	public void print() {
		System.out.println("Inside print method");
	}
}
