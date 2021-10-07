package lab2;

import java.util.Scanner;

public class Lab02_Q2 {

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

/*        long oil_Change_Price_Long = (long) OIL_CHANGE_PRICE;
        long battery_Change_Price_Long = (long) BATTERY_CHANGE_PRICE;
        long brake_Change_Price_Long = (long) BRAKE_CHANGE_PRICE;
        long tire_Change_Price_Long = (long) TIRE_CHANGE_PRICE;
        long other_Change_Price_Long = (long) OTHER_CHANGE_PRICE;   
*/
        System.out.println("*****************************************************************************************");
        System.out.println("***********************Maintanence Cost Distribution Table*******************************");
        System.out.println("*****************************************************************************************");

        System.out.println("*Oil Change\t\t\t%" + OIL_CHANGE + "\t\t\t" + OIL_CHANGE_PRICE + "\t\t\t\t*");
        System.out.println("*Battery   \t\t\t%" + BATTERY_CHANGE + "\t\t\t" +  BATTERY_CHANGE_PRICE +  "\t\t\t\t*");
        System.out.println("*Brakes    \t\t\t%" + BRAKE_CHANGE + "\t\t\t" + BRAKE_CHANGE_PRICE + "\t\t\t\t*");
        System.out.println("*Tire      \t\t\t%" + TIRE_CHANGE + "\t\t\t" + TIRE_CHANGE_PRICE + "\t\t\t\t*");
        System.out.println("*Other     \t\t\t%" + OTHER_CHANGE + "\t\t\t" + OTHER_CHANGE_PRICE + "\t\t\t\t*");
        System.out.println("*          \t\t\t " + "TOTAL" + "\t\t\t" + TOTAL_COST + "\t\t\t\t*");
        System.out.println("*****************************************************************************************");

        sc.close();


      
    }
    
}
