package HW2;


public class HW2{

    public static int calcFibA(int n){
        if (n < 2)
        {return n;}
        return calcFibA(n-1) + calcFibA(n-2);
    }

    public static int calcFibB(int n){
        if (n < 2){ return n;}
        int prev = 0;
        int ths = 1;
        int i = 2;
        int next = 0;


            while (i < n){
                next = prev + ths ;
                prev = ths;
                ths = next;
                i++;
            }
        return next;
    }

    public static void main(String[] args) {

        int input = 50;
        int n = 0;
        int x = 1;
        // while (n <= input)
        // {
        //     long begin = System.nanoTime();
        //     calcFibA(n);
        //     long end = System.nanoTime();
        //     long interval = end - begin;
        //     System.out.println(x  + "   a" + x  + "  // for n= " + n + " , F_" + n +" is calculated in " + interval + " nanoseconds");
        //     n += 5;
        //     x++;
        // }

        n = 0;
        x = 1;
        System.out.println("------------------------------------ \n entering another algorithm (calcFibB)");
        while (n <= input)
        {
            long begin = System.nanoTime();
            calcFibB(n);
            long end = System.nanoTime();
            long interval = end - begin;
            System.out.println(x  + "   b" + x +  "  // for n= " + n + " , F_" + n +" is calculated in " + interval + " nanoseconds");
            n += 5;
            x++;
        }
    }
}