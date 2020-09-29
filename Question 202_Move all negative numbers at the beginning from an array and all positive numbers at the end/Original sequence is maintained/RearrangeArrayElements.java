package com.test;

public class RearrangeArrayElements {

	static void rearrange(int arr[]) {
		int j, current;
		for (int i = 0; i < arr.length; i++) {
			current = arr[i];
			// if current element is positive then do nothing
			if (current > 0) {
				continue;
			}
			// if current element is negative, then shift positive
			// numbers of arr[0...i-1], one position to their right
			j = i - 1;
			while (j >= 0 && arr[j] > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		int arr[] = { -9, 5, 1, -2, -15, 7, 12, -3, 2 };
		rearrange(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}