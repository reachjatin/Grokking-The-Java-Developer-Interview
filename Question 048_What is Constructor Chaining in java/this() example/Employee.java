package com.test;

public class Employee {

	private String name;
	private int age;
	private int salary;
	
	public Employee() {
		this("Mike");
	}
	public Employee(String name) {
		this(name, 20);
	}
	public Employee(String name, int age) {
		this(name, age, 20000);
	}
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	void print() {
		System.out.println("Employee name : " + name);
		System.out.println("Employee age : " + age);
		System.out.println("Employee salary : " + salary);
	}
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.print();
	}

}