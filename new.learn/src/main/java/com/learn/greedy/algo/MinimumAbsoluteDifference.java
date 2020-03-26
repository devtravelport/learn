package com.learn.greedy.algo;

import java.util.Arrays;

public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int[] arr = {-59, -36, -13, 1 ,-53, -92, -2, -96, -54,75};
		
		
			System.out.println(minimumAbsoluteDifference(arr));	
		

	}

	static int minimumAbsoluteDifference(int[] arr) {
		Arrays.sort(arr);
		int l = arr.length;
		int result = Integer.MAX_VALUE;
		int temp;
		for(int i=0; i<= l-2; i++) {

				temp = Math.abs(arr[i]-arr[i+1]);
			if(temp<result) {
				result = temp;
			}
		}
		return result;
	}
}
