package lab6;

import java.util.Scanner;

public class Lab06_Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to be examined:");
        int input = sc.nextInt();

        System.out.printf("Number of digits : %d" , Lab06_Q4.countDigits(input));

        System.out.printf("sum of digits : %d" , Lab06_Q2.sumOfDigits(input));

        if(Lab06_Q1.isFibonnacci(input) == true)
        {
            System.out.printf("%d is a fibonacci number" , input);
        }
        else
        {
            System.out.printf("%d is not a fibonacci number" , input);
        }

        if (Lab06_Q2.isHarshad(input) == true)
        {
            System.out.printf("%d is a harshad number" , input);
        }
        else
        {
            System.out.printf("%d is not a harshad number" , input);

        }

        if (Lab06_Q3.isPrimeNumber(input) == true)
        {
            System.out.printf("%d is a prime number" , input);
        }
        else
        {
            System.out.printf("%d is not a prime number" , input);

        }

        if (Lab06_Q4.isNarcissistic(input) == true)
        {
            System.out.printf("%d is a narcissistic number" , input);
        }
        else
        {
            System.out.printf("%d is not a narcissistic number" , input);

        }
        
        sc.close();
    }
    
}
