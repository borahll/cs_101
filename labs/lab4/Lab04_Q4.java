package lab4;

import java.util.Scanner;

public class Lab04_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines:");
        short numberOfLines =sc.nextShort();
        String out = "";

        for(int n = 0; n<=numberOfLines-1 ; n++)
        {
            out = out + "*";
            System.out.println(out);
        }
        sc.close();
    }
    
}
