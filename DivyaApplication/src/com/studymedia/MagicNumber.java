package com.studymedia;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();   /*  199 */
		int sum=0;
		while(n>9)  /* 199>9 (T) */
		{
			while(n>0)  /*  199>0 (T) */
			{
				int d=n%10;    /*  d=199%10=9  */
				sum=sum+d;     /*  sum=0+9=9  */
				n=n/10;        /*  n=199/10=19  */
				
				/* go to  2nd while (19>0)=T */
				/* d=19%10=9 
				   sum=9+9=18
				   n=19/10=1 */
				
				/* go to 2nd while (1>0)=T */
				/* d=1%10=1
				   sum=18+1=19
				   n=1/10=0
				 */
				
				/* go to 2nd while (0>0)=F  */
			}
			n=sum;   /* n=19  */
			sum=0;   /* sum=0 */
			
			/*  go to 1st while(19>9)=T 
			    go to 2nd while(19>0)=T
			     d=19%10=9
			     sum=0+9=9
			     n=19/10=1 
			     go to 2nd while(1>0)=T
			     d=1%10=1
			     sum=9+1=10
			     n=1/10=0  */
			
			/* go to 2nd while(0>0)=F
			   n=10
			   sum=0
			   go to 1st while(10>9)=T
			   go to 2nd while(10>0)=T
			   d=10%10=0
			   sum=0+0=0
			   n=10/10=1
			   go to 2nd while(1>0)=T
			   d=1%10=1
			   sum=0+1=1
			   n=1/10=0
			   go to 2nd while(0>0)=F
			   n=1
			   sum=0
			   go to 1st while(1>9)=F
			 */
			System.out.println(n);
		}
		if(n==1) /*if (1==1)=T  print("Magic Number") */
		{
			System.out.println("Magic number");
		}
		else
		{
			System.out.println("Not a magic number");
		}
	}

}
