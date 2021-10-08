package lab2;

import java.util.Scanner;

public class Lab02_Q2_re {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your car's mileage : "); //Getting mileage 
        long carMilage = sc.nextLong();

        final double TOTAL_COST = Math.pow(carMilage, 2)/1000000;
        final double OIL_CHANGE = 30;
        final double BATTERY_CHANGE = 15;
        final double BRAKE_CHANGE = 25;
        final double TIRE_CHANGE = 13;
        final double OTHER_CHANGE = 100-OIL_CHANGE-BATTERY_CHANGE-BRAKE_CHANGE-TIRE_CHANGE;

        final double OIL_CHANGE_PRICE = TOTAL_COST*OIL_CHANGE/100;
        final double BATTERY_CHANGE_PRICE = TOTAL_COST*BATTERY_CHANGE/100;
        final double BRAKE_CHANGE_PRICE = TOTAL_COST*BRAKE_CHANGE/100;
        final double TIRE_CHANGE_PRICE = TOTAL_COST*TIRE_CHANGE/100;
        final double OTHER_CHANGE_PRICE = TOTAL_COST*OTHER_CHANGE/100;

        final char S = '*';

/*        long oil_Change_Price_Long = (long) OIL_CHANGE_PRICE;
        long battery_Change_Price_Long = (long) BATTERY_CHANGE_PRICE;
        long brake_Change_Price_Long = (long) BRAKE_CHANGE_PRICE;
        long tire_Change_Price_Long = (long) TIRE_CHANGE_PRICE;
        long other_Change_Price_Long = (long) OTHER_CHANGE_PRICE;   
*/
        System.out.println("*****************************************************************************************************************");
        System.out.println("**********************************Maintanence Cost Distribution Table********************************************");
        System.out.println("*****************************************************************************************************************");

        System.out.printf("*Oil change %42.2f%% ",OIL_CHANGE);
        System.out.printf("%38.2f ",OIL_CHANGE_PRICE);
        System.out.printf("%18.1s  \n", S);

        System.out.printf("*Battery %45.2f%% ",BATTERY_CHANGE);
        System.out.printf("%38.2f ",BATTERY_CHANGE_PRICE);
        System.out.printf("%18.1s  \n", S);

        System.out.printf("*Brake change %40.2f%% ",BRAKE_CHANGE);
        System.out.printf("%38.2f ",BRAKE_CHANGE_PRICE);
        System.out.printf("%18.1s  \n", S);

        System.out.printf("*Tire change %41.2f%% ",TIRE_CHANGE);
        System.out.printf("%38.2f ",TIRE_CHANGE_PRICE);
        System.out.printf("%18.1s  \n", S);

        System.out.printf("*Other change %40.2f%% ",OTHER_CHANGE);
        System.out.printf("%38.2f ",OTHER_CHANGE_PRICE);
        System.out.printf("%18.1s  \n", S);

        System.out.print("*\t\t\t\t\t\t TOTAL");
        System.out.printf("%40.2f", TOTAL_COST);
        System.out.printf("%19.1s  \n", S);     

        System.out.println("*****************************************************************************************************************");


        sc.close();
    }
}
