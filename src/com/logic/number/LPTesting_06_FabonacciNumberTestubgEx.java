package com.logic.number;


public class LPTesting_06_FabonacciNumberTestubgEx {
	static int n1 = 0, n2 = 1, number = 10;
	public static void main(String[] args) {
		
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 0; i < number - 2; i++) {
			int fabonacciValue = n1 + n2;
			n1 = n2;
			n2 = fabonacciValue;
			System.out.print(fabonacciValue + " ");
		}
		System.out.println();
		n1 = 0;
		n2 = 1;
		System.out.print(n1 + " " + n2 + " ");
		printFabonacci(number -2);
	}

	private static void printFabonacci(int number) {
		if (number > 0) {
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp;
			System.out.print(temp + " ");
			printFabonacci(number - 1);
		}
	}

}
