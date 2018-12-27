package com.bridgelabz.functional;
import com.bridgelabz.utility.*;

public class Distance
{

	    public static void main(String[] args) 
	    {

	        System.out.println("enter the distance value x");
	        double x = util.getDouble();
	        System.out.println("enter the distance value y");
	        double y = util.getDouble();

	        
	        double distance = util.dist(x,y);
	 
	        
	        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
	    }   
	}