package com.ds.recursion;

public class Program13_SumOfArrayElementsTailRecursion {

	private static int sumOfArrayElement(int[] ar, int n, int sum) {
		if (n == 0) {
			return sum;
		}
		return sumOfArrayElement(ar, n - 1, sum + ar[n - 1]);
	}

	public static void main(String[] args) {
		int[] ar = { 1, 2, 5, 9, 8 };
		System.out.println(sumOfArrayElement(ar, ar.length, 0));
	}

}
