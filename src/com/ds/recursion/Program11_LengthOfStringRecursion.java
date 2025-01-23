package com.ds.recursion;

public class Program11_LengthOfStringRecursion {
	
	private static int stringLength(String str) {
		if (str == null || "".equals(str)) {
			return 0;
		} else {
			return 1 + stringLength(str.substring(1));
		}
	}

	public static void main(String[] args) {
		String str = "Nandan";
		System.out.println(str.substring(1));
		System.out.println(stringLength(str));
	}

}
