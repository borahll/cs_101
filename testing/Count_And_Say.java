import java.util.Scanner;

public class Count_And_Say {

    public static String Counter(String a)
    {
        String newNum = "";
        char charPrev = a.charAt(0);
        int counter = 1;

        for (byte b = 1; b < a.length() ; b++)
        {
            if (a.charAt(b) == charPrev)
            {
                counter++;
            }
            else 
            {
                String counterString = Integer.toString(counter);
                newNum = newNum + counterString + a.charAt(b-1);
                counter = 1;
                charPrev = a.charAt(b);
            }
        }
        return newNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count_And_Say");
        String Input = sc.next();

        System.out.println(Counter(Input)); 

        sc.close();
    }
    
}
