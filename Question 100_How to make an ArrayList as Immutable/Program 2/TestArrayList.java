package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Mike");
		list.add("Lisa");
		System.out.println(list);
		
		list = Collections.unmodifiableList(list);
		list.add("Jack");
		System.out.println(list);
	}
}