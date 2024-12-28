package com.logic.number;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Integer number = null;
		String checking = "Y";
		do {
			System.out.print("Enter Number : ");
			number = sc.nextInt();
			if (number%2 == 0) {
				System.out.format("%d is even number", number);
			} else {
				System.out.format("%d is odd number", number);
			}
			number = null;
			System.out.println("\nDo you want to still checking with Number(Y/N) ? ");
			checking = sc.next();
		} while ("Y".equalsIgnoreCase(checking) || "yes".equalsIgnoreCase(checking));
		
		sc.close();
	}
}
