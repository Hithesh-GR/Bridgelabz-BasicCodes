package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class Dayofweek 
{
				public static void main(String[] args) 
				{
					int d, m, y;
					System.out.println("enter date in day month year");
					d = util.getInt();
					m = util.getInt();
					y = util.getInt();
					System.out.println("day is "+util.dayOfWeek(d, m, y));
				}
}