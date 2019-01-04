package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class taskScheduling 
{
	public static void main(String[] args) 
	{
		System.out.println("enter no of task");
		int tasks = util.getInt();
		int[] dead = new int[tasks] ;
		int[] min = new int[tasks] ;
		for (int i = 0; i < min.length; i++) 
		{
			System.out.println("task " +i+ " time");
			min[i] = util.getInt();
			System.out.println("task " +i+ " deadline");
			dead[i] = util.getInt();
		}
	}
}
