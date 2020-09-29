package com.cyclicbarrier.demo;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;

class Task1 implements Runnable {
	String name;
	List<Integer> numbers;
	CyclicBarrier barrier;
	
	public Task1(String name, List<Integer> numbers, CyclicBarrier barrier) {
		this.name = name;
		this.numbers = numbers;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		System.out.println(name + " is running");
		
		for(int i=1; i<=5; i++) {
			numbers.add(i);
		}
		
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(name + " has crossed the barrier");
	}
}

class Task2 implements Runnable {
	String name;
	List<Integer> numbers;
	CyclicBarrier barrier;
	
	public Task2(String name, List<Integer> numbers, CyclicBarrier barrier) {
		this.name = name;
		this.numbers = numbers;
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		System.out.println(name + " is running");
		
		for(int i=6; i<=10; i++) {
			numbers.add(i);
		}
		
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(name + " has crossed the barrier");
	}
}

class FinalTask implements Runnable {

	String name;
	List<Integer> numbers;
	
	public FinalTask(String name, List<Integer> numbers) {
		this.name = name;
		this.numbers = numbers;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for(Integer i : numbers) {
			sum = sum + i;
		}
		System.out.println("Sum of first 10 natural numbers : " + sum);
	}
	
}

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		List<Integer> numbers = new CopyOnWriteArrayList<Integer>();
		
		CyclicBarrier barrier = new CyclicBarrier(2, new FinalTask("Final Thread", numbers));
		
		Thread t1 = new Thread(new Task1("First Thread", numbers, barrier));
		Thread t2 = new Thread(new Task2("Second Thread", numbers, barrier));
		
		t1.start();
		t2.start();	
	}
}
