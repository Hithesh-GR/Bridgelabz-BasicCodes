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
}
