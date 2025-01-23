package com.ds.recursion;

public class Program10_ReverseOfString {

	private static void reverseString(String str) {//Nandan
		if (str == null || str.length() <= 1) {
			System.out.print(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));//n
			reverseString(str.substring(0, str.length() - 1));//Nanda
		}
	}

	public static void main(String[] args) {
		String str = "";
		//System.out.println(str.substring(0, str.length()-1));
		reverseString(str);
	}

}
