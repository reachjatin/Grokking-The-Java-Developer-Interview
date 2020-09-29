package com.iterator.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List: " + list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("List: " + list);
	}
}