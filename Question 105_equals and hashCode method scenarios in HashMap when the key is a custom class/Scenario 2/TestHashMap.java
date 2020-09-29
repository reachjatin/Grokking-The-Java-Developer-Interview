package com.hashmap.demo;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		
		Map<Employee, Integer> map = new HashMap<>();
		
		Employee e1 = new Employee("Mike", 15);
		Employee e2 = new Employee("Mike", 15);
		Employee e3 = new Employee("John", 20);
		Employee e4 = e3;
		
		System.out.println("e1 hashcode: " + e1.hashCode());
		System.out.println("e2 hashcode: " + e2.hashCode());
		System.out.println("e3 hashcode: " + e3.hashCode());
		System.out.println("e4 hashcode: " + e4.hashCode());
		
		System.out.println("e1 equals e2: " + e1.equals(e2));
		System.out.println("e3 equals e4: " + e3.equals(e4));
		
		map.put(e1, 100);
		map.put(e2, 200);
		map.put(e3, 300);
		map.put(e4, 400);
		
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));
		System.out.println(map.get(e3));
		System.out.println(map.get(e4));
		System.out.println("hashmap size: " + map.size());
	}
}