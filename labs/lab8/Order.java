package lab8;

public class Order {
    public static int count = 1;

    private int ID;
    private Food orderedFood;
    private double portion;
    private double price;
    private double totalPrice = 0.0;

    /**
     * constructor
     */
    public Order(double aPortion, String n, double aPrice){
        ID = count;
        portion = aPortion;
        // orderedFood.setName(n);
        price = aPrice;
        addOrder();
    }
    public Order(double aPortion, Food n){
        ID = count;
        portion = aPortion;
        orderedFood = n;
        price = n.getPrice();
        addOrder();
    }

    /**
     * accessor methods
     * 
     */
    public int getID(){return ID;}
    public String getOrderedFood(){return orderedFood.getName();}
    public double getPortion(){return portion;}
    public double getTotalPrice(){return totalPrice;}
    public int getCount(){return count;}

    /***
     * mutator methods
     */
    public void setOrderedFood(Food aFood){orderedFood = aFood;}
    public void setPortion(int aPortion){ portion = aPortion;}
    public void setPrice(double p){price = p;}


    public void addOrder(){count++;}
    public boolean  equals(Order order){
        if (this.ID == order.getID()){return true;}
        return false;
    } 
    public void checkout(){
        totalPrice = totalPrice + portion*price;
    }   
    public void increasePortion(int extraPortion){portion += extraPortion;}
    public String toString(){
        String err = "the order is not complete";
        String good = "details for order: " + ID + "\n" + orderedFood + "(x" + portion + ")" + "\nTOTAL: " + totalPrice;
        
        if (totalPrice == 0.0){return err;}
        else {return good;}
    } 
}
