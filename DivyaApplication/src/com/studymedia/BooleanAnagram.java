package com.studymedia;

import java.util.Arrays;

public class BooleanAnagram {
	static boolean anagram(String s1,String s2) {

		/*convert into Lowercase*/
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		/* char Array*/
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		/*sort Arrays*/
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="map";
		String s2="sri";
		System.out.println(anagram(s1 ,s2));
	}

}
