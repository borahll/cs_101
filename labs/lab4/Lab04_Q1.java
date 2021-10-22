package lab4;
import java.util.Scanner;

public class Lab04_Q1 {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Please input n: ");
    byte n = sc.nextByte();
    byte a = 0;

    int first = 0;
    int second = 1;
    int third = 0;

    while (a<=n-2)
    {
        a++;
        third = first + second;
        first = second;
        second =third;
    }

    System.out.printf("Fib(%d) is %d \n" , n , third );


    sc.close();
    }
}
