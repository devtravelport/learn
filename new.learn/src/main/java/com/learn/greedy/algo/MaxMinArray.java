package com.learn.greedy.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] arr = {100,200, 300,350, 400,401,402};
		int k =3;
		System.out.println(maxMin(k, arr));

	}
	
	static int maxMin(int k, int[] arr) {
		Arrays.sort(arr);
		int result = Integer.MAX_VALUE;
		int length = arr.length;
		int temp;
		for (int i = 0; i <= arr.length - k; i++) {

			temp = arr[i + k - 1] - arr[i];
			if (temp < result) {
				result = temp;
			}

		}

		return result;
	}

}
