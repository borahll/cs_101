package lab2;

import java.util.Scanner;

import java.lang.String;

public class Lab02_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the title:");
        String title = sc.nextLine();


        System.out.println("------------------------------------------");


        int num_Of_Characters = title.length();
        System.out.println("Number of characters is:" + num_Of_Characters);

        System.out.println("All uppercase:\t" + title.toUpperCase());

        System.out.println("Remove leading and trailing blank charecters:" + title.trim());

//      char char_At_User = sc.next().charAt(0);

        System.out.println("Charecter at index position 5:" + title.charAt(5));

        String x_Y = title.substring(2,7);
        System.out.println("Substring from 3rd character(inclusive) to 8th character(exclusive):" + x_Y);
        
/*      System.out.print("\nEnter the Character to Find =  ");
		char ch = sc.next().charAt(0);
*/
        char a = 'a';
        System.out.println("First occurence of character 'a':" + title.indexOf(a));
        System.out.print("Last occurence of character 'a':" + title.lastIndexOf(a) + "\n");



        sc.close();
    }
}
