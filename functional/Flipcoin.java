package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class Flipcoin 
{
	public static void main(String[] args) 
	{
		float heads=0;
		float tails=0;
		System.out.println("enter the num of times to flip coin");
		int flip=util.getInt();
		for(int i=1;i<=flip;i++)
		{
			System.out.println(util.getRandomValue());
			if(util.getRandomValue()>0.5)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		System.out.println("Percentage of Heads is "+ (heads/flip)*100 + "%");
		System.out.println("Percentage of tails is "+ (tails/flip)*100 + "%");
		System.out.println("Heads "+heads);
		System.out.println("Tails "+tails);
	}
	
}
	