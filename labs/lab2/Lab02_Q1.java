package lab2;

import java.util.Scanner;

public class Lab02_Q1 {

    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);  //opening scanner


        System.out.print("Enter the width of the rectangle: ");	//recatangle width input
         double width = scanObj.nextDouble();

        System.out.print("Enter the height of the rectangle: ");  //rectangle height input
         double height = scanObj.nextDouble();

        
        System.out.println("The area of the rectangle is\t:\t" + width*height);  //area calculating

        System.out.println("The circumference of the rectangle is\t:\t" + (2*(width+height)));  //circumference calculating

        System.out.println("The diagonal of the rectangle is\t:\t" + Math.sqrt(Math.pow(height, 2)+ Math.pow(width, 2)));   //diagonal distance calculating

        scanObj.close();


    }

    
}
