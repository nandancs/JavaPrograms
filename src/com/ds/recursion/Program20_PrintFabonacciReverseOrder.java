package com.ds.recursion;


public class Program20_PrintFabonacciReverseOrder {

	private static int printReverseFabonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return printReverseFabonacci(n-1) + printReverseFabonacci(n-2);
	}

	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			System.out.print(printReverseFabonacci(i) + " ");;
		}
	}

}
