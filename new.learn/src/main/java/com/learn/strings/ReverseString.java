package com.learn.strings;

import java.util.ArrayList;

public class ReverseString {
//Simple string reversal
	  public static void main (String[] args) {  
		    // keep this function call here     
		    System.out.print(FirstReverse("Coder")); 
		    System.out.println("^^^^^");
		    System.out.println(newApproachReverse("Hello"));
		    System.out.println("****xxx " + longestWord("I love new approach"));
		  }
	  
	  
	  public static String FirstReverse(String str) {

		  char stringArray[] = str.toCharArray();
		  int length = stringArray.length -1;
		 char[] reverseArray = new char[stringArray.length];
		 
		  for(int i=0; i <=length; i++) {
			  reverseArray[i]= stringArray[length-i];
		  }
		   // String reverse = new String(reverseArray);
		    // OR 
		     String reverse = String.valueOf(reverseArray);
		    System.out.println("new string **" + reverse);

		    return reverse;
		  }
	  
	  public static String newApproachReverse(String str) {
		/*
		 * StringBuilder sb = new StringBuilder(str); sb.reverse(); String revString =
		 * sb.toString();
		 */
		 //OR
		  String revString = new StringBuilder(str).reverse().toString();
		  
		  
		  return revString;
	  }
	  
	  /*
	   * String can be reversed using ArrayList and use an iterator over that
	   * to print reverse string
	   * 
	   * Following are some interesting facts about String and StringBuffer classes :
	   *1. Objects of String are immutable.
	   *2. String class in Java does not have reverse() method, however StringBuilder class has built in reverse() method.
	   *3. StringBuilder class do not have toCharArray() method, while String class does have toCharArray() method.
	   */
	  
	  //Find longest word in string
	  public static String longestWord(String str) {
		 String[] firstArray = str.split(" ");
		 
		 String temp = firstArray[0];
		  for(int i =0; i<firstArray.length; i++) {
			 if (temp.length()< firstArray[i].length()) {
				 temp= firstArray[i];
			 }
			 
		  }
		  
		 return temp; 
	  }
}
