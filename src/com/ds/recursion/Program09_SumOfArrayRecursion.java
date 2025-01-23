package com.ds.recursion;

public class Program09_SumOfArrayRecursion {
	private static int computeSum(int[] array, int n) {
		if (n == 1) {
			return array[n - 1];
		} else {
			return computeSum(array, n - 1) + array[n - 1];
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 3 };
		int sum = computeSum(array, array.length);
		System.out.println(sum);
	}

}
