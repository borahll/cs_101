package lab6;

import java.util.Scanner;

public class Lab06_Q4 {

    public static int power(int a , int b)
    {
        int result = a;

        if (b == 0)
        {
            return 1;
        }

        for (byte c = 0; c < (b - 1) ; c++)
        {
            result = result * a;
        }
        return result;
    }

    public static int countDigits(int a)
    {
        int digitCount = 0;

        while (a > 0)
        {
            a = a / 10;
            digitCount++;
        }

        return digitCount;
    }

    public static boolean isNarcissistic(int a)
    {
        int digit = 0;
        int sum = 0;

        while ( a > 0)
        {
            digit = a % 10;
            sum = sum + power(digit, countDigits(a));
            a = a / 10;
        }

        if (a == sum)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (isNarcissistic(a) == true )
        {
            System.out.println("it is narssicistic");
        }
        else
        {
            System.out.println("it is not narssistic");
        }
        sc.close();
    }
    
}
