package com.learn.datastructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */

	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		for(int i : nums) {
			numsMap.put(nums[i],i);
		}
		
		for(int i : nums) {
			if(numsMap.containsKey(target - nums[i])) {
				return new int[] {i, numsMap.get(target - nums[i])};
			}
		}
		
		throw new IllegalArgumentException("No two sum solution"); //without this line, it will throw 
		//compilation error saying method should return int array
	}
	
	
	public static String findNumber(List<Integer> arr, int k) {

	if (arr.contains(k)) {
		return "Yes";
	}else {
		return "No";
	}

	    }

}
