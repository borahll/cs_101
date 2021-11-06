package lab6;

import java.util.Scanner;

public class Lab06_Q2 {

    public static boolean isHarshad(int a)
    {
        if ((a % sumOfDigits(a)) == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static int sumOfDigits(int a)
    {
        int sum = 0;
        while (a > 0)
        {
            byte remainder = (byte) (a % 10);
            sum = sum + remainder;
            a = a / 10; 
        } 
        return sum;  
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        if(isHarshad(a) == true)
        {
            System.out.println("it is a harshad number");
        }
        else 
        {
            System.out.println("it is not a harshad number");
        }

        sc.close();
    }
}
