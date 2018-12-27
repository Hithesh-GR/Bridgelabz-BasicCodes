package com.bridgelabz.functional;
import com.bridgelabz.utility.*;

public class Gambler 
{ 
    public static void main(String[] args) 
    {
    	System.out.println("enter the stake value");
        int stake  = util.getInt();    
        System.out.println("enter the goal value");
        int goal   = util.getInt();    
        System.out.println("enter trials");
        int trials = util.getInt();    
        int bets = 0;        
        int wins = 0;        

        for (int t = 0; t < trials; t++) 
        {

            int cash = stake;
            while (cash > 0 && cash < goal) 
            {
                bets++;
                if (Math.random() < 0.5) 
                	cash++; 
                else        
                	cash--;
            }
            if (cash == goal) 
            	wins++;
        }

        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets percentage = " + 1.0 * bets / trials);
    }

}

