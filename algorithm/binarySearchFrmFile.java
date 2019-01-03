package com.bridgelabz.algorithm;
import java.io.FileNotFoundException;
import com.bridgelabz.utility.*;
public class binarySearchFrmFile 
{
	public static void main(String[] args)
	{
		try 
		{
			util.binarySearchStringFile();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}