package com.bridgelabz.functional;
import com.bridgelabz.utility.*;

public class Windchill 
{
	    public static void main(String[] args) 
	    {
	    	System.out.println("enter the value of t & v");
	    	
	        double t = util.getDouble();
	        
	        double v = util.getDouble();
	        
	        double w = util.wind(t,v);
	        
	        System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
	    }

	}

