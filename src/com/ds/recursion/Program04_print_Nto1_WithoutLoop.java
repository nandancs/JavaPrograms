package com.ds.recursion;

public class Program04_print_Nto1_WithoutLoop {

	public static void main(String[] args) {
		printNto1(10);

	}

	private static void printNto1(int i) {
		if (i > 0) {
			System.out.print(i + " ");
			printNto1(i - 1);
		}
		
	}

}
