package com.ds.recursion;

public class Program12_SumOfDigitsInNumber {

	private static int sumOfDigits(int number) {
		if (number > 0) {
			return (number % 10) + sumOfDigits(number / 10);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(1253));
	}

}
