package lab8;

public class Food {
    private String name = "";
    private String ingredients = "";
    private int calories = 0;
    private String type = "";
    private int price = 0; 

    /**
     * constructor with 2 inputs
     */
    public Food(String aName, int aPrice){
        name = aName;
        price = aPrice;
        // ingredients = null;
        // type = null;
    }

    /**
     * contructor with 5 inputs
     */
    public Food(String aName, String i, int c, String t, int p){
        name = aName;
        ingredients = i;
        calories = c;
        type = t;
        price = p;
    }

    /**
     * accesor methods
     */
    public String getName(){return name;}
    public String getIngredients(){return ingredients;}
    public String getType(){return type;}
    public int getCalories(){return calories;}
    public int getPrice(){return price;}

    /**
     * mutator methods
     */
    public void setName(String n){name = n;}
    public void setType(String t){type = t;}
    public void setPrice(int p){ price = p;}
    public void setCalories(int c){calories = c;}
    public void setIngredients(String i){ingredients = i;}

    /**
     * other methods
     */

     public boolean equals(Food aFood){
         if(this.name.equals(aFood.getName())){
             if(this.ingredients.equals(aFood.getIngredients())){
                 return true;
             }
         }
         return false;
     }

     public void addNewIngredients(String aIngredient){
         ingredients = aIngredient + "," + ingredients;
     }

     public boolean doesContain(String aIngredient){
         if (this.ingredients.indexOf(aIngredient) == -1){ return false;}
         return true;
     }

     public String toString(){
         String s = name + "is a " + type + " dish" + "\nIt includes " + ingredients + "\nSingle portion contains " + calories + "\nSingle serving cost is " + price;
         return s;
     }

    
}
