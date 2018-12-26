package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the UserName");
		String s1=util.getString();
		String stringTemplate="Hello <<username>>, How are you?";
		if(s1.length()>=3)
		{
			String s2=stringTemplate.replace("<<username>>",s1);
			System.out.println(s2);
		}
		else
		{
			System.out.println("The username must be more than 3 characters");
		}
	}
}
