package com.hashmap.demo;

import java.lang.reflect.Field;
import java.util.HashMap;

class Employee {
	private int age;
	
	public Employee(int age) {
		this.age = age;
	}
}

public class TestHashMap {
	public static void main(String[] args) throws Exception {
		HashMap<Employee, String> map = new HashMap<>();
		
		for(int i=1;i<=13;i++) {
			map.put(new Employee(i), "Hello " + i);
		}
		
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(map);
		System.out.print("hashmap capacity: ");
		System.out.print(table == null ? 0 : table.length);
		System.out.println("\nhashmap size:" + map.size());
	}
}