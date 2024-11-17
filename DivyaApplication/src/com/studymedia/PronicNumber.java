package com.studymedia;

import java.util.Scanner;

public class PronicNumber { /*Pronic number means product of two consecutive integers,the number of form is (n(n+1))
the first few pronic numbers are 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 .... */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); /*n=2*/
		int s=0;
		for(int i=0;i<n;i++) /* i=0;i<n(0<2);i++ (True) */
		{
			if(i*(i+1)==n)  /* 0*(0+1)==2 (0==2)=>False
			 					increment i++; (0+1=1)
			 					goto for loop i<n(1<2)
			 					goto if (1*(1+1))==2  (2==2)=>True
			 						s=1;
			 						break;
			 						*/
			{
				s=1;
				break;
			}
		}
		if(s==1)  /*(1==1)=>True*/
		{
			System.out.println("Pronic number");/* print pronic number */
		}
		else
		{
			System.out.println("Not a Pronic number");
		}

	}

}
