package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class sqrt 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println("enter no. to find square root");
			double c = util.getDouble();
			System.out.println("square root is " + util.sqrut(c));
		}
		catch (Exception e) 
		{
			System.out.println("entered integer value is "+e.getMessage());
		}
	}
}
