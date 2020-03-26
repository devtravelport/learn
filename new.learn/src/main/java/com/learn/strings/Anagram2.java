package com.learn.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Anagram2 {

	public static void main(String[] args) {
		List<String> dictionary = new ArrayList<String>();
		List<String> query = new ArrayList<String>();
		dictionary.add("a");
		dictionary.add("ab");
		dictionary.add("ba");
		dictionary.add("arnk");
		dictionary.add("nkra");
		dictionary.add("knar");
		query.add("a");
		query.add("ab");
		query.add("nakr");
		stringAnagram1(dictionary,query);

	}

	public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {

		List<Integer> finalList = new ArrayList<Integer>();

		// Write your code here
		for (int i = 0; i < query.size(); i++) {
			int count = 0;
			char[] firstArr = query.get(i).toLowerCase().toCharArray();

			// dictionary.stream().filter(predicate)

			for (int j = 0; j < dictionary.size(); j++) {
				char[] dictArr = dictionary.get(j).toLowerCase().toCharArray();
				Arrays.sort(firstArr);
				Arrays.sort(dictArr);
				if (Arrays.equals(firstArr, dictArr))
					count++;
			}
			finalList.add(count);
		}
		return finalList;
	}

	public static List<Integer> stringAnagram1(List<String> dictionary, List<String> query) {

		List<Integer> finalList = new ArrayList<Integer>();
		Map<String,Integer> myMap = new HashMap<String,Integer>();
		int value =0;

		// Write your code here
		for (int i = 0; i < dictionary.size(); i++) {
			char[] dictArr = dictionary.get(i).toLowerCase().toCharArray();
			Arrays.sort(dictArr);
			if(myMap.containsKey(new String(dictArr))) {
				value = myMap.get(new String(dictArr));
				value++;
				myMap.put(new String(dictArr), value);
			}else {
				myMap.put(new String(dictArr), 1);
			}
			

		}
		
		for (int j = 0; j < query.size(); j++) {
			char[] queryArr = query.get(j).toLowerCase().toCharArray();
			Arrays.sort(queryArr);
			if(myMap.containsKey(new String(queryArr))) {
				finalList.add(myMap.get(new String(queryArr)));
			}
		}
		
		System.out.println("print map " + myMap);
		System.out.println("print list " + finalList);
		return finalList;
	}
}
