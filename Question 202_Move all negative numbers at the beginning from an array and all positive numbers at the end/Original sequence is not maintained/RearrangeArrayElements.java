package com.test;

public class RearrangeArrayElements {

	static void rearrange(int arr[]) {
		int j=0, temp;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {-9, 5, 1, -2, -15, 7, 12, -3, 2};
		rearrange(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}