package com.immutable.demo;

public final class Employee {
	
	private final String name;
	private final int age;
	private final Address address;
	
	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() { return name; }

	public int getAge() { return age; }

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
