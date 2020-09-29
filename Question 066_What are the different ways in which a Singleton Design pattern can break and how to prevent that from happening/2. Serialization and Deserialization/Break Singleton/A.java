package com.singleton.demo;

import java.io.Serializable;

public class A implements Serializable{

	private static final long serialVersionUID = -2020L;

	private A() { }
	
	public static final A instance = new A();
	
}