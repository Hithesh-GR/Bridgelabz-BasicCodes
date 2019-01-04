package com.bridgelabz.algorithm;
import com.bridgelabz.utility.*;
public class guesstheNumber 
{
	    public static int search(int lo, int hi) 
	    {
	        if ((hi - lo) == 1) 
	        	return lo;
	        int mid = lo + (hi - lo) / 2;
	        System.out.printf("Is it less than %d?  \n",+mid);
	        if (readBoolean() != null) 
	        	return search(lo, mid);
	        else
	        	return search(mid, hi);
	    }
		private static Object readBoolean() 
		{
			// TODO Auto-generated method stub
			return null;
		}
		public static void main(String[] args) 
	    {
	        int k = util.getInt();
	        int n = (int) Math.pow(2, k);
	        System.out.printf("Think of an integer between %d and %d\n", 0, n-1);
	        int secret = search(0, n);
	        System.out.printf("Your number is %d\n",+secret);
	    }
}

