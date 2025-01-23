package com.ds.recursion;

public class Program16_MinimumValueFromArray {

	private static int findMinimum(int ar[], int n) {
		if (n == 1) {
			return ar[n - 1];
		} else {
			return Math.min(ar[n - 1], findMinimum(ar, n - 1));
		}
	}

	public static void main(String[] args) {
		int ar[] = { 10, 20, 30, -40, 50 };
		int min = findMinimum(ar, ar.length);
		System.out.println(min);
	}

}
