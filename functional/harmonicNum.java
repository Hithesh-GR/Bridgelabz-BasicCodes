package com.bridgelabz.functional;

import com.bridgelabz.utility.util;

public class harmonicNum {

	public static void main(String[] args) 
	{
		System.out.println("enter N th number");
		int n=util.getInt();
		float sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(float)1/i;
			
		}
System.out.println("N th Harmonic number is " +sum);
	}

}
