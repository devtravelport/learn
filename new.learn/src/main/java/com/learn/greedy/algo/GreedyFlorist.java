package com.learn.greedy.algo;

import java.util.Arrays;

public class GreedyFlorist {

	public static void main(String[] args) {
		int[] c = {1,3,5,7,9};
		System.out.println(getMinimumCost(3, c));

	}

	static int getMinimumCost(int k, int[] c) {//k = number of friends
		int flowers = c.length;//total number of flowers to be purchased
		Arrays.sort(c);
		int count=0;
		int sum = 0;
		for(int i=flowers-1; i>=0 ; i--) {
			if(count<k) {
				sum = sum+ c[i];
						count++;
			}else {
				sum =  sum+ ((count+1)*c[i]);
				count++;
			}
		}
		return sum;
}
}
