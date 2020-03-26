package com.learn.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class StringToLearn {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();*/
      String s = "welcometojava";
      int k =3;
        System.out.println(getSmallestAndLargest(s, k));
        
        /**
         * Check if string is palindrome
         * 
         */
        String A = "welcome";
        String revString = new StringBuilder(A).reverse().toString();
        if(A.equals(revString)) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}
	
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> myList = new ArrayList<String>();
        
        for(int i=0; i < s.length()-k+1; i++) {
        	myList.add(s.substring(i, i+k));
        }
        
      //  while()
        System.out.println("list before sort "+ myList);
        
        Collections.sort(myList);
        System.out.println("list after sort "+ myList);
        
        return myList.get(0) + "\n" + myList.get(myList.size()-1) ;
    }
	


}
