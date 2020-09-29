package com.tech;

interface Interface1 {
	default void hello() {
		System.out.println("Hello from Interface1");
	}
}

interface Interface2 {
	default void hello() {
		System.out.println("Hello from Interface2");
	}
}

public class Child implements Interface1, Interface2 {
	
}