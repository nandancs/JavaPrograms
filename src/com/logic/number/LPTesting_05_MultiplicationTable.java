package com.logic.number;

public class LPTesting_05_MultiplicationTable {

	public static void main(String[] args) {
		System.out.println();
		int number = 50;
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + (i == 10 ? " * ": " *  ") + i + " = " + number * i);
		}
	}

}
