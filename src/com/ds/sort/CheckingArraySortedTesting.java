package com.ds.sort;

public class CheckingArraySortedTesting {

	public static void main(String[] args) {
		int arr[] = new int[] { 20, 21, 45, 89, 89, 100 };
		boolean isSorted = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				isSorted = false;
				break;
			}
		}
		System.out.println(isSorted ? "Yes" : "No");
		
		System.out.println("---");
		
		int countIndex = 0;
		int tempCount = arr.length - 1;
		while (countIndex < arr.length - 1) {
			if (arr[countIndex] <= arr[countIndex + 1]) {
				tempCount--;
			}
			countIndex++;
		}
		System.out.println(tempCount == 0 ? "Yes" : "No");
	}

}
