package com.test;

public class FindLargestThree {
	//method to find the largest three numbers from an array
	public static void findLargestThree(int arr[]) {
		
		if(arr.length < 3) {
			System.out.println("Invalid input, Array size is less than 3");
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			int current = arr[i];
			
			if(current > first) {
				third = second;
				second = first;
				first = current;
			} else if(current > second) {
				third = second;
				second = current;
			} else if (current > third) {
				third = current;
			}
		}
		System.out.println("Three largest elements are: " + first
				+ ", " + second + ", " + third);
	}
	
	public static void main(String[] args) {
		int arr[] = {19, 5, 78, 1, 33, 11, 20};
		findLargestThree(arr);
	}
}
