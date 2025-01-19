package com.test.program;

import java.util.*;

public class Solution {

	public static List<Integer> getQueryResults(long N, List<List<Integer>> queries) {
		List<Long> goodArray = new ArrayList<>();// Step 1: Generate the goodArray 
		long powerOfTwo = 1;// Decompose N into powers of two
		while (N > 0) {
			if ((N & 1) == 1) {
				goodArray.add(powerOfTwo);
			}
			N >>= 1; // Right shift N to process the next bit
			powerOfTwo <<= 1; // Move to the next power of two
		}
		Collections.sort(goodArray);// Step 2: Sort goodArray in non-decreasing order
		List<Integer> result = new ArrayList<>();// Step 3: Process the queries
		for (List<Integer> query : queries) {
			int l = query.get(0) - 1; // Convert 1-based to 0-based index
			int r = query.get(1) - 1; // Convert 1-based to 0-based index
			int m = query.get(2);
			long product = 1;// Calculate the product of elements from l to r, modulo m
			for (int j = l; j <= r; j++) {
				product = (product * goodArray.get(j)) % m;
			}

			result.add((int) product); // Store the result for this query
		}

		return result; // Return the result as a List<Integer>
	}

	// Test the solution with an example
	public static void main(String[] args) {
		long N = 6;

		// Example queries, formatted as a list of lists
		List<List<Integer>> queries = new ArrayList<>();
		queries.add(Arrays.asList(1, 2, 4));
		queries.add(Arrays.asList(2, 2, 8));
		queries.add(Arrays.asList(1, 1, 4));

		// Call the function
		List<Integer> result = getQueryResults(N, queries);
		System.out.println(result); // Output should be [0, 4, 2]
	}
}