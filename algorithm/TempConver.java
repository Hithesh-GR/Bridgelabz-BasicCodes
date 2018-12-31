package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class TempConver 
{
				public static void main(String[] args) 
				{
				try 
				{
					System.out.println("enter temp in c or f");
					int tem = util.getInt();
					char t = util.getString().charAt(0);
					if (t != 'f' && t != 'F' && t != 'c' && t != 'C') 
					{
						System.out.println("enter correct input");
						main(args);
						return;
					}
					tem = util.TemperatureConversion(tem, t);
					System.out.println("coverted temp is " + tem);
				} 
				catch (Exception e) 
				{
					System.out.println("temperature in format 4545 c");
				}

			}
		}