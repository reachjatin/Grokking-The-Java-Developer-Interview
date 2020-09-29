package com.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		final List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Mike");
		list.add("Lisa");
		
		System.out.println(list);
	}
}