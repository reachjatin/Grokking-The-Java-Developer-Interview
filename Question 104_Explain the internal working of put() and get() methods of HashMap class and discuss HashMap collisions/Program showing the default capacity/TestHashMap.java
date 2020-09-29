package com.hashmap.demo;

import java.lang.reflect.Field;
import java.util.HashMap;

public class TestHashMap {
	public static void main(String[] args) throws Exception {
		HashMap<String, String> map = new HashMap<>();	
		map.put("name", "Mike");
		
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(map);
		System.out.print("hashmap capacity: ");
		System.out.print(table == null ? 0 : table.length);
		System.out.println("\nhashmap size:" + map.size());
	}
}