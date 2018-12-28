package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class twoDarray 
{
			public static void main(String[] args) 
		{
		  System.out.println("enter number of rows");
	      int rows=util.getInt();
	      System.out.println("enter number of columns");
	      int columns=util.getInt();
	       String arr[][] =new String[rows][columns];
	       System.out.println("enter the elements");
	       int j=0;
	       for(int i=0;i<rows;i++)
			{
				for(j=0;j<columns;j++) 
				{
					arr[i][j]=util.getString();
				}
				
			}
				for(int i=0;i<rows;i++)
				{
					for( j=0;j<columns;j++) 
					{
						System.out.print(arr[i][j]+" ");
					}
				
					System.out.println();
					}

		}
	}
