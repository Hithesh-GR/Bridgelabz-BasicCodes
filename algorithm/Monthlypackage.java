package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class Monthlypackage 
{
	public static void main(String[] args) 
	{
		System.out.println("enter principal ,year and rate");
		double p = util.getDouble();
		double y = util.getDouble();
		double r = util.getDouble();
		System.out.println("mothly payment is " +util.monthlyPayment(p, y, r));
	}
}	

	