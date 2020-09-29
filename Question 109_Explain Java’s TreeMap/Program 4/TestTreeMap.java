package com.treemap.demo;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

class Employee {
	String name;
	int age;
	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<Employee, Integer> map = new TreeMap<>(
				new Comparator<Employee>() {
					@Override
					public int compare(Employee e1, Employee e2) {					
						if(e1.age < e2.age){
							return 1;
						} else if(e1.age > e2.age) {
							return -1;
						}
						return 0;
					}		
				}
			);
		
		map.put(new Employee("Mike", 20), 100);
		map.put(new Employee("John", 10), 500);
		map.put(new Employee("Ryan", 15), 200);
		map.put(new Employee("Lisa", 40), 400);
		
		map.forEach((k,v) -> System.out.println(k + ":" + v));		
	}
}
