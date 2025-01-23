package com.ds.recursion;

public class Program18_PalindromeStringEx {

	private static boolean checkPalindrome(String str, int start, int end) {
		if (start >= end) {
			return true;
		} 
		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return checkPalindrome(str, start + 1, end - 1);		
	}

	public static void main(String[] args) {
		String str = "abc";
		boolean palidrome = checkPalindrome(str, 0, str.length() - 1);
		System.out.println(palidrome);
	}

}
