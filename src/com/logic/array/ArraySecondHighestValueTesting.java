package com.logic.array;

import java.util.Arrays;
import java.util.List;

public class ArraySecondHighestValueTesting {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 10, 9, 18, 18, 19, 20, 6 };
		int findNthHighest = 2;

		// Check if the array has less than two elements
		if (arr == null || arr.length < 2) {
			System.out.println("Array should have at least two elements.");
		}

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int currentValue = arr[i];
			
			if (currentValue > largest) {
				secondLargest = largest;
				largest = currentValue;
			} else if (currentValue > secondLargest && currentValue != largest) {
				secondLargest = largest;
			}
			
		}

		// Print the result
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element.");
		} else {
			System.out.println("Second largest number is: " + secondLargest);
		}

		System.out.println("--------------------------");

		List<Integer> list = Arrays.asList(arr);
		Integer val = list.stream().sorted((v1, v2) -> v2.compareTo(v1)).skip(findNthHighest - 1).findFirst().get();
		System.out.println(val);
	}
}
