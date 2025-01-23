package com.ds.recursion;

public class Program08_IndirectRecursion {
	
	private static void funA(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			funB(n -1);
		}
	}

	private static void funB(int i) {
		if (i > 0) {
			System.out.print(i + " ");
			funA(i/2);
		}
	}

	public static void main(String[] args) {
		funA(20);

	}

}
