package com.ds.recursion;

public class Program19_SetNBitsOfNumber {

	private static String findBit(int n, String str) {// 101, 2^n, ..., 2^3, 2^2,2^1,2^0
		if (n == 0) {
			return 0 + str;// 5
		}
		if (n == 1) {
			return 1 + str;// 5
		}
		int no1 = n % 2;
		str = no1 + str;
		return findBit((n / 2), str);//
	}

	public static void main(String[] args) {
		String value = findBit(11, "");
		System.out.println(value);
		String str = "a";
		System.out.println(str.substring(1).isEmpty());
		int nt = count1Value(value, 0);
		System.out.println(nt);
	}

	private static int count1Value(String value, int count) {// 1011
		
		if (value.isEmpty()) {
			return count;
		}

		if ("1".equals("" + value.charAt(0))) {
			count = count + 1;
		} 
		return count1Value(value.substring(1), count);

	}

}
