package com.logic.number;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		System.out.println();
		int number = 5, sum = 0;

		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("Sum of " + number +" natural number is " + sum);
		
		System.out.println("Sum of " + number +" natural number is " + (number * (number + 1))/2);
	}

}
