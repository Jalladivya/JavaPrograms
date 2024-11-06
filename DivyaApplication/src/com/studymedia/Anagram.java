package com.studymedia;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Define s1,s2*/
		String s1="divya";
		String s2="lokes";
		
		/* convert the strings into lowercase*/
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		/* both string length is not equal then print not anagram*/
		if(s1.length()!=s2.length()) 
		{
			System.out.println("Not Anagram");
		}
		else
		{
			/*convert into characterArray */
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			
			/*sort the Arrays*/
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			/* compare the arrays with equals()*/
			if(Arrays.equals(c1,c2)==true)
			{
				System.out.println("Both strings are Anagrams");
			}
			else
			{
				System.out.println("Not a Anagrams");
			}
		}
		}

}
