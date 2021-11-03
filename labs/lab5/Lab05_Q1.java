    package lab5;

    import java.util.Scanner;

    public class Lab05_Q1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter city plan string:");
            String cityPlan = sc.next();
            int cityPlanLenght = cityPlan.length();
            int max = 0;
            int min = Integer.MAX_VALUE;

            for(byte a = 0; a<=cityPlanLenght-1;a++)
            {
                if(Integer.parseInt(String.valueOf(cityPlan.charAt(a)))>max)
                {
                    max = Integer.parseInt(String.valueOf(cityPlan.charAt(a)));
                }
                else if(Integer.parseInt(String.valueOf(cityPlan.charAt(a)))<min)
                {
                    min = Integer.parseInt(String.valueOf(cityPlan.charAt(a))); 
                }
            }

            int maxKill = max;

            for (byte c = 0;c<=maxKill-1; c++)
            {
                for(byte b = 0;b<=cityPlanLenght-1;b++)
                {
                    int value = Integer.parseInt(String.valueOf(cityPlan.charAt(b)));
                    if(value >= max)
                    {
                        System.out.print("*");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                max--;
            }
            
            sc.close();
        }
    }
