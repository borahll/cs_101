    package lab5;

    import java.util.Scanner;

    public class Lab05_Q1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter city plan string:");
            String cityPlan = sc.next();
//            Integer cityPlanInt = Integer.valueOf(cityPlan);
            String replayTimeConvert = "" + cityPlan.charAt(0);
            Integer replayTime = Integer.parseInt(replayTimeConvert);
            String star = "";

            for(short i = 0; i<= cityPlan.length(); i++)
            {
                for(short a = 0; a <= replayTime-1 ; a++)
                {
                    star = star + "*";
                    System.out.println(star);
                }
            }

            sc.close();
        }
    }
