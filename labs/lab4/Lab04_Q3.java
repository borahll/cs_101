package lab4;

import java.util.Scanner;

public class Lab04_Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input n: ");
        byte inputN = sc.nextByte();
        int sum = 0;
        short max = 0;
        short min = 0;
        float average = 0;
        byte n = 0;
       
        System.out.printf("Now input %d positive integers:\n" , inputN);

        while ( n<=inputN-1)
        {
            short in = sc.nextShort();
            sum = sum + in;
            average = sum/inputN;
            n++;

            if (in>max)
            {
                max=in;
                min = max;
            }
            else if(in<min)
            {
                min=in;
            }
            
        }
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);


        sc.close();;
    }
}
