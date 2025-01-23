package com.ds.recursion;

public class Program07_TreeRecursionBasic {
	
	private static void fun(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			fun(n - 1);
			fun(n - 1);
		}
	}

	public static void main(String[] args) {
		fun(3);
	}

}
