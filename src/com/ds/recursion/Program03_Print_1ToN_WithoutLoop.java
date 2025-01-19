package com.ds.recursion;

public class Program03_Print_1ToN_WithoutLoop {

	public static void main(String[] args) {
		print1ToN(10);
	}

	private static void print1ToN(int n) {
		if (n > 0) {
			print1ToN(n - 1);
			System.out.println(n);
		}
	}

}
