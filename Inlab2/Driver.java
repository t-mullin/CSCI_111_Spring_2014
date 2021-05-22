
/**
 * Driver for GroceryItem Class.
 * 
 * @author Tristan Mullin 
 * @version 22 January 2014
 */
public class Driver
{
    public static void main(String[] args){
        //Sets item1's name, cost, and numInStock
        GroceryItem item1 = new GroceryItem("milk", 3.39, 75);
        //Prints the set variables for item1
      //  System.out.println(item1.getName() + " is $" + item1.getCost() + " per gallon.");
        System.out.println("The latest shipment of " + item1.getName() + " cost the store $" + item1.getValue() + " for " + item1.getStock() + " units." );
        System.out.println(); //prints a new line
        
        //Sets item2's name, cost, and numInStock
        GroceryItem item2 = new GroceryItem("Bread", 4.49, 125);
        //Prints the set variables for item2
        System.out.println(item2.getName() + " is $" + item2.getCost() + " a loaf, and the store has " + item2.getStock() + " loaves in stock.");
    }
}
