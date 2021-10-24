package lab4;

import java.util.Scanner;
import java.lang.String;

public class Lab04_Q2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please input the string: ");
    String user_Palindrome = sc.next();

    int user_Palindrome_Lenght = user_Palindrome.length();
    String reverse = "";
    String palindrome_TF = "";
    int i = user_Palindrome_Lenght-1 ;


    while( i >= 0 )
    {
        reverse = reverse + user_Palindrome.charAt(i);
        i--;  
    }


    if(reverse.equals(user_Palindrome))
    {
        palindrome_TF = "it is a palindrome";
    }
    else
    {
        palindrome_TF = "it is not a palindrome";
    }


    System.out.printf("%s\n" , palindrome_TF);
    sc.close();   
    }
}
