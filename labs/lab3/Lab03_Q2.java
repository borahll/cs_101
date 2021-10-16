package lab3;

import java.util.Scanner;
import java.lang.String;

public class Lab03_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a year:");
        int year_Input = sc.nextInt();
        int century = (year_Input / 100) + 1;
        String addittion = "";

        if (century == 11 || century == 12 )
        {
            addittion = "th";
        } 
        else if ( century % 10 == 1)
        {
            addittion = "st";
        }
        else if (century % 10 == 2)
        {
            addittion = "nd";
        }
        else if ( century %10 == 3)
        {
            addittion = "rd";
        }
        else 
        {
            addittion ="";
        }
    
        if (year_Input % 4 == 0)
        {
            if (year_Input % 100 == 0 )
            {
                if(year_Input % 400 == 0)
                {
                    System.out.println(year_Input + " is in " + century + addittion + "century" +" and is a leap year");              
                }
                else
                {
                    System.out.println(year_Input + " is in " + century + addittion + "century"  + " and is not a leap year");              
                }
            }
            else
            {
                System.out.println(year_Input + " is in " + century + addittion + "century" +" and is a leap year");              
            }    
        }
        else
        {
            System.out.println(year_Input + " is in " + century + addittion + "century" +" and is not a leap year");              
        }
        sc.close();
    }    
}
