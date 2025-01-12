package com.logic.number;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before swapping\na\tb\n" + a + "\t" + b);

		b = a + b;// b = 30
		a = b - a;// a = 20
		b = b - a;// b = 10
		System.out.println("After swapping\na\tb\n" + a + "\t" + b);
	}

}
