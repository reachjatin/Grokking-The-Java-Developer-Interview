package com.multithreading.demo;

public class WaitDemo {
	public static void main(String[] args) {
		WaitDemo wd = new WaitDemo();
		
		try {
			wd.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}
