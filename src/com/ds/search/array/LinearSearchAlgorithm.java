package com.ds.search.array;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40, 50 };
		int x = 51;
		int indexPosition = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				indexPosition = i;
				break;
			}
		}
		System.out.println(indexPosition != -1 ? "Element found at index position :" + indexPosition : "Element is not found in available data.");
	}

}
