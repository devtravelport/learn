package com.learn.datastructures;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PracticeLinkedListUnitA {

	//LinkedList doesnot permit null values
	
	public static void main(String[] args) {
		
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("Red");
		linkList.add("Yellow");
		linkList.add("Orange");
		linkList.add("Green");
		System.out.println("Using Lambda streams");
		linkList.stream()
		.forEach(p -> System.out.println(p));
		System.out.println("Using Iterato");
		Iterator<String> it =linkList.iterator();//cannot traverse backwards
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using List Iterator- Traversing backwards");
		ListIterator<String> lIt = linkList.listIterator(linkList.size());//Note that we are creating new ListIterator object and moving the cursor to last
		while(lIt.hasPrevious()) {
			System.out.println(lIt.previous());
			
		}
		linkList.addLast("Brown");
		System.out.println(linkList);
		linkList.offerFirst("Pink");//offerFirst returns boolean but addFirst() is void
		
		linkList.stream()
		.forEach(p -> System.out.println(p + "**" + linkList.indexOf(p)));// element and its index
		
		//swapping 2 elements
		Collections.swap(linkList, 2, 3);
		System.out.println(linkList);
		
		Collections.shuffle(linkList);
		System.out.println("Shuffle  " + linkList);
		Collections.reverse(linkList);
		System.out.println("Reverser  " + linkList);
		
	
	}

}
