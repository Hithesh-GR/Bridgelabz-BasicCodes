package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class Leapyear 
{
	    public static void main(String[] args) 
	    {
	      System.out.println("enter the year");
	      String s1=util.getString();
	      int year=Integer.parseInt(s1);
	      if(s1.length()==4)
	      {
	    	  if(year % 4 ==0)
	    	  System.out.println("This is a leap year");
	    	  else
	    	  System.out.println("This is not a leap year");
	      }
	    	  else
	    		 System.out.println("enter year format like yyyy");
	      }
	    }



	      