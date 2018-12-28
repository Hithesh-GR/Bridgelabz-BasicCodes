package com.bridgelabz.functional;
import com.bridgelabz.utility.*;
public class Permutation 
{
		private static void swap(char[] ch, int i, int j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		private static void permutations(char[] ch, int currentIndex)
		{
			if (currentIndex == ch.length) 
			{
				System.out.println(String.valueOf(ch));
			}
			for (int i = currentIndex; i < ch.length; i++)
			{
				swap(ch, currentIndex, i);
				permutations(ch, currentIndex + 1);
			}
		}
		public static void main(String[] args)
		{
			System.out.println("enter the value");
			String s=util.getString();
			System.out.println("the differnt variants are:");
			permutations(s.toCharArray(), 0);
		}
}
	