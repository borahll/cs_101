package lab8;

public class User {

    private static byte count = 1; //Id will be initializde here
    //private static short orderIndex = 0;


    private int ID ;   
    private String name;
    private int age;

    private String orders = "";
    private int numberOfOrders = 0;
    private String eatenFoods = "";

    //private because it should only be accesable in this class
    private void adduser(){
        ID = count;
        count++;
    }
    
    //constructor
    public User(String aName, int aAge){
        name = aName;
        age = aAge;
        adduser();
    }

    /****
     * accesor methods
     * 
     */
    public int getID(){return ID;}
    public int getAge(){return age;}
    public int getNumberOfOrders(){return numberOfOrders;}
    public String getName(){return name;}
    public String getOrders(){return orders;}
    public String getEatenFoods(){return eatenFoods;}



    /***
     * mutator methods
     * 
     */

     public void setName(String aName){ name = aName;}
     public void setAge(byte aAge){ age = aAge;}

     public boolean equals(User aUser){
         if (this.name.equals(aUser.getName()))
         {
             if(this.ID == aUser.getID())
             {
                 if (this.age == aUser.getAge())
                 {
                     return true;
                 }
             }
         }
         return false;
     }

     public boolean didEat(Food aFood){
            if (eatenFoods.indexOf(String.valueOf(aFood)) == -1 ){return false;}
            return true;
     }

     public String pickOrderbyIndex(int index){
         int orderCounter = 1;
         int charCounter = 0;
         String wantedOrder = "";
         
         while (orderCounter <= index){

            if (index == 1){
                wantedOrder = wantedOrder + String.valueOf(this.orders.charAt(charCounter));
            }

            
            if(String.valueOf(this.orders.charAt(charCounter)).equals("-")){
                orderCounter++;
            }

            if (orderCounter == index - 1){
                wantedOrder = wantedOrder + String.valueOf(this.orders.charAt(charCounter));
            }
            
             charCounter++;
         }

         return wantedOrder;
     }

     public void addNewOrder(Order aOrder){
         orders = orders + aOrder.getID() + "-" ;
         numberOfOrders++;
         eatenFoods = eatenFoods + aOrder.getOrderedFood() + "-";
     }

     public String toString(){
         String s = "User ID= " + ID + " ,User name= " + name + ", Age" + age;
         return s;
     }
}
