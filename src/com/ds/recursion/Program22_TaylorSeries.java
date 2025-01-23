package com.ds.recursion;

public class Program22_TaylorSeries {

	static double p = 1, f = 1; static double r;

	private static double taylorSeries(int x, int n) {
		if (n == 0) {
			return 1;
		}
		r = taylorSeries(x, n - 1);
		p = p * x;
		f = f * n;
		return r + p/f;
	}

	public static void main(String[] args) {
		System.out.println(taylorSeries(4, 20));

	}

}
