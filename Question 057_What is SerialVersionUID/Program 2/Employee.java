package com.serialization.demo;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 21L;
	
	private String name;
	private int age;
	private transient int salary;
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}