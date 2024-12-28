package com.logic.number;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckSumAndGetIndex {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2, 3 };
		int target = 6;
		int[] arr = twoSum(nums, target);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <nums.length; i++) {
			int current = nums[i];//3, 2, 3
			int x = target - current;// 6 - current
			if (map.containsKey(x)) {// checking map containing x
				return new int[] {map.get(x), i};
			}
			map.put(current, i);
		}
		return null;
		
		
        /*int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tempSum = nums[i] + nums[j];
                if (target == tempSum) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;*/
		
    }
}
