package com.ds.recursion;

public class Program02_StaticVariableTesting {

	static int n = 0;// case -2
	
	public static void main(String[] args) {
		int a = 5;// case -1
		System.out.printf("%d", testingStaticValue(a));
	}

	private static int testingStaticValue(int a) {
		if (a > 0) {
			n++;
			return testingStaticValue(a - 1) + n;
		}
		return 0;
	}

}
