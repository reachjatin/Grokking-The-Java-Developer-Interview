package com.iterator.demo;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorTest {
	public static void main(String[] args) {	
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();	
		map.put(1, "Mike");
		map.put(2, "John");
		map.put(3, "Lisa");
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + " : " + map.get(key));
			map.put(4, "Ryan");
		}
		System.out.println("Map: " + map);
	}
}