package com.singleton.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) {

		A instance1 = A.instance;
		A instance2 = null;
		Constructor[] constructors = A.class.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			constructor.setAccessible(true);
			try {
				instance2 = (A) constructor.newInstance();
				break;
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Instance1 hashcode : " + instance1.hashCode());
		System.out.println("Instance2 hashcode : " + instance2.hashCode());
	}
}