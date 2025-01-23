package com.ds.recursion;

public class Program21_PowerOfNumber {

	private static int powerOfSol1(int m, int n) {
		if (n == 0) {
			return 1;
		}
		return m * powerOfSol1(m, n - 1);
	}

	private static int powerOfSol2(int m, int n) {
		if (n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			return powerOfSol2(m * m, n / 2);
		} else {
			return m * powerOfSol2(m * m, (n - 1) / 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(powerOfSol1(2, 9));
		System.out.println(powerOfSol2(2, 9));

	}

}
