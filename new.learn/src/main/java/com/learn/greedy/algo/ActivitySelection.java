package com.learn.greedy.algo;

import java.util.Arrays;

public class ActivitySelection {

	public static void main(String[] args) {
		int start[]  =  {1, 3, 0, 5, 8, 5};
		int finish[] =  {2, 4, 6, 7, 9, 9};
		System.out.println(totalActivities(start, finish));
		

	}
	
	public static int totalActivities(int[] start, int[] finish) {
		int result =1;
		int finishCount =0;
		//if finish array not sorted than we may have to sort but than start array will get messed up
		for (int i=1; i<start.length; i++) {
			if(finish[finishCount]<= start[i]) {
				result++;
				finishCount = i;
			}
		}
		return result;
	}

}
