package com.treemap.demo;

import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(4, "Mike");
		map.put(1, "John");
		map.put(3, "Jack");
		map.put(2, "Lisa");
		
		map.forEach((k,v) -> System.out.println(k + ":" + v));		
	}
}