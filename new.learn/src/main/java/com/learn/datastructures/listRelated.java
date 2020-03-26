package com.learn.datastructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class listRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//making list unmodifiable
		//Collections.unmodifiableList(a); you can not add any new parameter in it now
		
	//using CopyOnWriteArrayList we can create a list which can be iterated in thread safe way

		//Selecting a random elelment from the list
		
		String randomEle = a.get(((int)Math.random())*a.size());
		
		System.out.println("**** " + randomEle + "&&&& " +((int)Math.random())*a.size());
		a.add(0, "orange");
		 Collections.sort(a);
		for (String x : a) {
			System.out.println(x + "for");
		}
		System.out.println(a.get(2));
		
		List<String> b = new ArrayList<String>();
		b.addAll(a);
		b.add("orange");
		for (String x : b) {
			System.out.println(x + " new ");
		}
		
		System.out.println("**** " + b.get(((int)Math.random())*b.size()) + "&&&& " +((int)Math.random())*b.size());
		//a.
		
		Random rm = new Random();
		System.out.println("**** " + b.get(rm.nextInt(b.size()))) ;
		
		//removing null from List
		//Collections.singleton(null); returns immutable set of same object
		//b.removeAll(Collections.singleton(null)); now we use this set on removeAll method of list
	
		
		/*
		 * removing duplicate from list
		 */
		
		List<String> withoutDupes = new ArrayList<String>(new HashSet<String>(b));
	System.out.println(withoutDupes);//order gone in this case
	
	List<String> withoutDupes1 = b.stream().distinct().collect(Collectors.toList());
	System.out.println(withoutDupes1);//order is maintained
	
	
	List<String> dupeB = new ArrayList<String>(b);//
	System.out.println(b.equals(dupeB));
	
	
	//mergeArrays();
	mergeArraysCorrected();
	}
	
	//in java 10 copying list is simple
	//List<T> copy = List.copyOf(list);
	
	
	//Merge 2 sorted arrays
	
	public static void mergeArrays() {
		Integer[] one = {1,5,2,8};
		Integer[] two = {3,1,5,6};
		
		List<Integer> merged = Arrays.asList(one);
		Collections.addAll(merged,two); //Here I have List not ArrayList, thats why its giving unsupported exception
		//as array elements can be added to AraayList not List
		
		System.out.println(merged);
	}
	
	public static void mergeArraysCorrected() {
		Integer[] one = {1,5,2,8};
		Integer[] two = {3,1,5,6};
		
		List<Integer> merged = new ArrayList<Integer>();
		Collections.addAll(merged,one); 
		Collections.addAll(merged,two);
		
		
		Collections.sort(merged);
		System.out.println(merged);
		one = merged.toArray(one);
		for(Integer i:one) {
			System.out.println(i);
		}
	}
  
}

