package com.logic.number;

public class LPTesting_07_ArmstrongNumberEx {
	public static void main(String[] args) {
		// some of all digit cube = number
		int number = 153;
		int temp = number;
		int sumArms = 0;
		while (temp > 0) {
			int digit = temp % 10;
			temp = temp / 10;
			sumArms = sumArms + (digit * digit * digit);
		}
		System.out.println(sumArms == number ? "Provided number is Armstrong..." : "Not Armstrong...");
	}
}
