package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class sumof3integer 
{
		static void sumcount(int n) 
		{
			int[] arr = new int[n];
			int count = 0;
			System.out.println("enter values");
			for (int i = 0; i < n; i++) 
			{
				arr[i] = util.getInt();
			}
			
			for (int i = 0; i < arr.length; i++) 
			{
				for (int j = i + 1; j < arr.length; j++) 
				{
					for (int k = j + 1; k < arr.length; k++) 
					{
						if (arr[i] + arr[j] + arr[k] == 0) 
						{
							count++;
							System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
						}
					}
				}
			}
			
			System.out.println("total pairs are " + count);

		}

		public static void main(String[] args) 
		{
			System.out.println("enter no of inputs");
			int n = util.getInt();
			sumcount(n);

		}
	}