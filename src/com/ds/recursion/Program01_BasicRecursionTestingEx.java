package com.ds.recursion;

public class Program01_BasicRecursionTestingEx {

	public static void main(String[] args) {
		int x = 5;
		function1(x);
		System.out.println("\n---------");
		function2(x);

	}

	private static void function1(int n) {
		if (n > 0) {
			System.out.printf("%d ", n);
			function1(n - 1);
		}
	}
	private static void function2(int n) {
		if (n > 0) {
			function2(n - 1);
			System.out.printf("%d ", n);
		}
	}

}
