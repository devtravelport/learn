package com.learn.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Two strings, and , are called anagrams if they contain all the same
 * characters in the same frequencies. For example, the anagrams of CAT are CAT,
 * ACT, TAC, TCA, ATC, and CTA.
 * 
 * Complete the function in the editor. If and are case-insensitive anagrams,
 * print "Anagrams"; otherwise, print "Not Anagrams" instead.
 * 
 * @author meenu.haseen
 *
 */
public class AnagramStrings {

	public static void main(String[] args) {
		String a = "anagramm";
		String b = "margana";
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		
String s = ",_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.";
		List<String> newList = new ArrayList<String>();
		s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
		String[] updatedString = s.split("\\p{Space}+");
		
	System.out.println(updatedString.length);
	for(int i=0; i<updatedString.length; i++) {
		System.out.println(updatedString[i]);
	}

	}

	static boolean isAnagram(String a, String b) {
		char[] firstArr = a.toLowerCase().toCharArray();
		char[] secondArr = b.toLowerCase().toCharArray();

		Arrays.sort(firstArr);
		Arrays.sort(secondArr);

		return Arrays.equals(firstArr, secondArr);

	}

	/**
	 * Method which find odd number between two integers
	 * 
	 * @param l
	 * @param r
	 * @return
	 */
	public static List<Integer> oddNumbers(int l, int r) {
		List<Integer> myList = new ArrayList<Integer>();

		for (int i = l; i <= r; i++) {
			if (!(i % 2 == 0)) {
				myList.add(i);
			}
		}
		return myList;
	}
	
	
	public static void printToken(String s) {
		List<String> newList = new ArrayList<String>();
		String regex = "[A-Za-z !,?._'@]+";
		String[] tokens = s.split(regex);
		System.out.println(tokens);
	}
}
