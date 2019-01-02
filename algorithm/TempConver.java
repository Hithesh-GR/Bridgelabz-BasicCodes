package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class TempConver 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter temperature in Fahrenheit :"); 
		float temperatue = util.getFloat(); 
		float celsius = util.toCelsius(temperatue); 
		System.out.printf("%.02f degree fahrenheit temperature is equal to \n %.02f "
							+ " degree celsius \n", temperatue, celsius);
		System.out.println("Enter temperature in degree celsius :"); 
		temperatue = util.getFloat(); 
		float fahrenheit = util.toFahrenheit(temperatue); 
		System.out.printf("%.02f degree celsius is equal to \n %.02f "
							+ " degree fahrenheit \n", temperatue, fahrenheit);
	}
				
}

