package lab3;

import java.util.Scanner;
import java.lang.String;

public class Lab03_Q1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("please enter weigght:");
        double weight = sc.nextDouble();
        System.out.println("\n");
        System.out.print("please enter height:");
        float height = sc.nextFloat();
        String weight_Category = "";

        double bodyWeightRatio = weight/Math.pow(height,2);

        if (bodyWeightRatio<18.5)
        {
            weight_Category = "underweight";
        }
        else if (18.5<= bodyWeightRatio && bodyWeightRatio<25)
        {
            weight_Category = "normal";
        }
        else if (25<bodyWeightRatio && bodyWeightRatio<30)
        {
            weight_Category = "overweight";
        }
        else if (30<=bodyWeightRatio)
        {
            weight_Category = "obese";
        }

        System.out.println("your BMI is " + String.format("%.2f", bodyWeightRatio) + " and you are in the " + weight_Category );

        sc.close();

    }
}
