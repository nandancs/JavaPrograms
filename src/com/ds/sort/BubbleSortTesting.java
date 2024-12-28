package com.ds.sort;

import java.util.Arrays;

public class BubbleSortTesting {
	public static void main(String[] args) {
		int[] arr = new int[] { 12, 7, 8, 15, 40, 50, 25, 10, 30, 20 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean sorted = false;
			for (int j = 0; j < arr.length - i -1; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sorted = true;
				}
			}
			if (!sorted) {
				break;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
	}
}
