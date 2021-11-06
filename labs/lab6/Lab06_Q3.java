package lab6;

import java.util.Scanner;

public class Lab06_Q3 {

    public static boolean isPrimeNumber(int a)
    {
        
        for (byte b = 2; b < a/2; b++)
        {
            if ( a % b == 0 )
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        
        if (isPrimeNumber(input) == true )
        {
            System.out.println("prime num");
        }
        else 
        {
            System.out.println("it is not a prime num");
        }
        
        sc.close();
    }
    
}
