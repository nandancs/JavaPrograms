package com.ds.recursion;

public class Program14_FabonacciNumber {
	
	private static int printFabonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int n1 = printFabonacci(n -1) + printFabonacci(n -2);
			//System.out.print(n1 + " ");
			return n1;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.print(printFabonacci(i) + " ");
		}
	}

}
