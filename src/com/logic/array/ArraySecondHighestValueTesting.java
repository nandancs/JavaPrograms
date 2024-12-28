package com.logic.array;

import java.util.Arrays;
import java.util.List;

public class ArraySecondHighestValueTesting {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 10, 9, 8, 18, 20, 6 };
		
		List<Integer> list = Arrays.asList(arr);
		Integer val = list.stream().sorted((v1, v2) -> v2.compareTo(v1)).skip(1).findFirst().get();
		System.out.println(val);
	}
}
