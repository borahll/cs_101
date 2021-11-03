//package lab1;

public class Lab01_Q2 {

    public static void main(String[] args) {

        // declaring the expressions

        double eq1 = (32.2 - (1.7 / 2.2)) / ((1.5- 7.3) * (4.3 + 2.4));          
        double eq2 = ((73.5 * 16.4 - Math.pow(3,6)) / (34 + Math.pow(2, 5)));
        double eq3 = (Math.pow(1.2 + 0.8, -1/3) );


        //First expression

        System.out.print("Result of the first expression is : "); 
        System.out.println(eq1);


        //second expresiion

        System.out.print("Result of the second expression is : ");   
        System.out.println(eq2);
        

        //third expression

        System.out.print("Result of the third expression is : ");   
        System.out.println(eq3);

    }
    
}
