package com.bridgelabz.utility;
import java.util.Scanner;
import java.util.Random;
public class util 
{
	static Scanner sc=new Scanner(System.in);
	public static String getString()
	{
		String stringValue=sc.nextLine();
		return stringValue;
	}
	public static double getDouble()
	{
		double doubleValue=sc.nextDouble();
		return doubleValue;
	}
	public static int getInt()
	{
		int intValue=sc.nextInt();
		return intValue;
	}
	public static double getRandomValue()
	{
		Random random=new Random();
		double Random=random.nextDouble();
		return Random;
	}
	public static void primeFactor(int number)
	{
		for(int i=1;i<=number;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				while(number%i==0)
				{
					System.out.println(i);

					number=number/i;
				}
			}
		}
	}
	public static double dist(double x,double y)
	{
		double distance=Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
		return distance;
	}
	public static void roots(double a,double b,double c)
	{
		double delta=((b*b)-(4*a*c));
		double root1=(-b+(Math.sqrt(delta))/(4*a));
		double root2=(-b-(Math.sqrt(delta))/(4*a));
		System.out.println("1st root of the equation is "+root1);
		System.out.println("2nd root of the equation is "+root2);
	}
	public static double wind(double t,double v)
	{
		double w=35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		return w;
	}
	public static char[] convertionOfStringToCharacterArray(String s1) 
	{
		char[] c1 = s1.toCharArray();
		return c1;
	}
	public static int TemperatureConversion(int tem, char t) 
	{
		int conver;
		if (t == 'c' || t == 'C') 
		{
			conver = (tem * 9 / 5) + 32;
		} 
		else if (t == 'f' || t == 'F') 
		{
			conver = (tem - 32) * 5 / 9;
		} 
		else 
		{
			System.out.println("Enter correct input");
			return 0;
		}
		return conver;
	}
	public static int dayOfWeek(int d, int m, int y) 
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
}
