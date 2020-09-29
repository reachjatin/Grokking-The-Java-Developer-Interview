package com.generic.demo;

class Test<T> {
	private T obj;
	
	public Test(T obj) {
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		
		Test<String> t1 = new Test<>("Mark");
		System.out.println(t1.getObject());
		
		Test<Integer> t2 = new Test<>(10);
		System.out.println(t2.getObject());
		
	}

}