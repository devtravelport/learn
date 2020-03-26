package com.learn.datastructures;

import java.util.HashMap;

public class DataStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myArray = {2,5,5,2,3,5,1,2,4};
firstRecurringValue(myArray);

String s = "Helloworld";
int start =3;
int end =7;
System.out.println(s.substring(start, end));
	}
	
	
	//Google Question
	//Given an array = [2,5,1,2,3,5,1,2,4]:
	//It should return 2

	//Given an array = [2,1,1,2,3,5,1,2,4]:
	//It should return 1

	//Given an array = [2,3,4,5]:
	//It should return undefined
	
	public static int firstRecurringValue(int[] array) {
		HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		int temp = 0;
		for(int i =0; i<array.length; i++) {
			if(!myMap.containsKey(array[i])) {
				myMap.put(array[i], i);
			}
			else {
				temp = array[i];
				break;
			}
		}
		System.out.println("first recurring value " +temp);
		return temp;// This is big O(n)
	}

	//public static String 
}
