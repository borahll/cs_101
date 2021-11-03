//package lab1;

public class Lab01_Q3 {
    public static void main(String[] args) {
        
         final int totalEarthSurfaceArea = 510072000; //earth total area
         final double areaOfTurkey = 0.1536; //00         //Turkey total area
         double water = 70.8;                //00         //Water percentage of Earth
         double land = 29.2;                 //00         //Land percentage of Earth
         double turkeyWetLand = 1.3;         //0000         //water percentage of Turkey
         double turkeyDryLand = 98.7;        //0000


        System.out.println("Earth has " + (totalEarthSurfaceArea*land)/100 + " km2 dry land and "  + (totalEarthSurfaceArea*water)/100 +" km2 water." );   //First expression

        System.out.println("Turkey has " + (totalEarthSurfaceArea*turkeyDryLand*areaOfTurkey)/10000 + " km2 dry land and " + (totalEarthSurfaceArea*areaOfTurkey*turkeyWetLand)/10000 + " km2 water.");    //Second expression

        System.out.println("Turkey has " + ((((totalEarthSurfaceArea*areaOfTurkey*turkeyDryLand)/10000) / (totalEarthSurfaceArea*land)/100)/100) + " percent of the Earth's dry land.");        //Third expression

        System.out.println("Turkey has " + ((((totalEarthSurfaceArea*areaOfTurkey*turkeyWetLand)/10000) / (totalEarthSurfaceArea*water)/100)/100) + " percent of the Earth's wet land.");       //Fourth expression
                                 
    }
    
}
