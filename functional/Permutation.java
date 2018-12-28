package com.bridgelabz.functional;
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
			if (currentIndex == ch.length - 1) 
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
			String s = "abc";
			permutations(s.toCharArray(), 0);
		}
}
	