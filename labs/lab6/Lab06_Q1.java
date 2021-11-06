package lab6;

import java.util.Scanner;


public class Lab06_Q1 {

    public static boolean isPerfectSquare(int a)
    {
        double aChecker = Math.sqrt(a);
        int aCheckerInt = (int) aChecker;

        if (Math.pow(aCheckerInt, 2) == a)
        {
            return true;
        }

        else 
        {
            return false;
        }
    }

    public static boolean isFibonnacci(int a)
    {
        int aIsFibonacciChecker1Option =  (int)(5 * Math.pow(a, 2) + 4);
        int aIsFibonacciChecker2Option =  (int)(5 * Math.pow(a, 2) - 4);

        if (isPerfectSquare(a) == true)
        {
            if (isPerfectSquare(aIsFibonacciChecker1Option) == true || isPerfectSquare(aIsFibonacciChecker2Option) == true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else 
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(isFibonnacci(a) == true)
        {
            System.out.println("it is in the fibonacci sequance");
        }
        else
        {
            System.out.println("it is not in the fibonacci sequance");
        }


        sc.close();
    }
}
