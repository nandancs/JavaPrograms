package com.ds.recursion;

public class Program06_SumNnaturalNumber {

	public static void main(String[] args) {
		int sum = findSumOfNaturalNumbers(5);
		System.out.println(sum);
	}

	private static int findSumOfNaturalNumbers(int i) {
		if (i == 1) {
			return 1;
		} else {
			return findSumOfNaturalNumbers(i - 1) + i;
		}
	}

}
