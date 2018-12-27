package com.bridgelabz.functional;
import java.util.ArrayList;
import java.util.Random;
import com.bridgelabz.utility.*;
public class CouponNumbers 
{
	public static void main(String[] args)
	{
		System.out.println("enter the distinct coupon number");
		int n=util.getInt();
		ArrayList<Integer> a1=new ArrayList();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			Random random=new Random();
			count++;
			int coupon=random.nextInt(n);
			System.out.println("coupon no " +coupon);
			if(!a1.contains(coupon))
			{
				a1.add(coupon);
			}
			else
				i--;
			}
		System.out.println("enter distinct random numbers");
		for(Integer k:a1)
			System.out.println(k);
		System.out.println("total of all distinct num is "+count);
		}
	}
