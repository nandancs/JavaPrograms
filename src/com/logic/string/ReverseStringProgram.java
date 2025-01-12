package com.logic.string;

public class ReverseStringProgram {
	public static void main(String[] args) {
		String str = "Nandan";
		String temp = "";
		char ch = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			temp = ch + temp;
		}
		System.out.println(temp);
	}
}
