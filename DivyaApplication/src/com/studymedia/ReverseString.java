package com.studymedia;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Divya",revs=" ";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			revs=ch+revs;
			
		}
		System.out.println(revs);

	}

}
