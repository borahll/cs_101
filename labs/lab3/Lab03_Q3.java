package lab3;

import java.util.Scanner;
import java.lang.String;

public class Lab03_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "1234";
        int bank_Balance = 1000;
        
        
        System.out.print("please enter your password:");
        String user_Pin = sc.nextLine();
        System.out.println("\n");

        if (user_Pin.equals(password)) 
        {
            System.out.println("1- Withdraw money \n2- Open a new account \n3- Change PIN\n");
            System.out.print("please enter option:");
            byte selected = sc.nextByte();

            if (selected == 1)
            {
                System.out.println("Enter the amount to withdraw:");
                float withdraw_Amount = sc.nextFloat();
                Float newBankAccountBalance = bank_Balance-withdraw_Amount;

                System.out.println("the new balance is : " + newBankAccountBalance);
            }

            else if (selected == 2)
            {
                System.out.print("1- TRY \n2- USD \nSelect currency type:");
                byte currencyType = sc.nextByte();
                if (currencyType == 1)
                {
                    System.out.println("Your new TRY account is now opened! Bye!");
                }
                else if ( currencyType == 2)
                {
                    System.out.println("Your new USD account is now opened! Bye!");
                }
                else 
                {
                    System.err.println("please enter a valid input");
                }
            }
            else if (selected == 3)
            {
                System.out.print("Enter your new PIN:");
                String newPassword = sc.nextLine();
                String newPasswordUserShow = newPassword.charAt(0) + "**" + newPassword.charAt(3);
                System.out.println("your new password is " + newPasswordUserShow);
            }
            else
            {
                System.err.println("please enter a valid input");
            }


        } 
        else 
        {
            System.err.println("Invalid PIN bye!!!"); 
        }
    
        sc.close();
    }    
}
