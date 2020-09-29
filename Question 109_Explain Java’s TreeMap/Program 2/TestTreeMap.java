package com.treemap.demo;

import java.util.TreeMap;

class Employee {
	String name;
	int age;
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class TestTreeMap {
	public static void main(String[] args) {
		
		TreeMap<Employee, Integer> map = new TreeMap<>();
		
		map.put(new Employee("Mike", 20), 100);
		map.put(new Employee("John", 10), 500);
		map.put(new Employee("Ryan", 15), 200);
		map.put(new Employee("Lisa", 20), 400);
		
		map.forEach((k,v) -> System.out.println(k + ":" + v));		
	}
}