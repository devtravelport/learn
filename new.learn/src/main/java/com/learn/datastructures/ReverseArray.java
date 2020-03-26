package com.learn.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
static int i =0;
String s = "hello";

	public static void main(String[] args) {
		int[] arr = {2,3,6,9};
		List<Integer> arrList = new ArrayList<Integer>();
		
		for(int a : arr) {
			arrList.add(a);
		}
		
		Collections.reverse(arrList);
		//System.out.println(arrList);
		System.out.println(fullMove(arr, 3));
	}
	
	static int[] fullMove (int[] arr, int totalRotations) {
		//int i=0;
		while(i<= totalRotations) {
			move(arr);
			i++;
		}
		System.out.println(arr);
		return arr;
	}
	static int[] move(int[] arr) {
		if(i>= arr.length-1) {
			if(i == arr.length-1) {
				arr[i] = arr[0];
				i=0;//reset i
			}
		}
		arr[i] = arr[i+1];
		return arr;
	}
	


}
