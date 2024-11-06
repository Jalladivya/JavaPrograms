package com.studymedia;

public class StrPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mom" ,rev="";
		int slen=s.length();
		for(int i=(slen-1);i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println(s+ "is a palindrome");
		}
		else
		{
			System.out.println(s+" is not a palindrome");
		}
	   

	}

}
