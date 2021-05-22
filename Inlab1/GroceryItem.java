
/**
 * This class tracks the sale of items in the store.
 * 
 * @author Tristan Mullin
 * @version 15 January 2014
 */

public class GroceryItem
{
    // instance variables
    private String name;    // sets an items name
    private double cost;    // sets the cost of an item
    private int aisleNum;   // where is the item is located in the store
    private int itemStock;  // itemStock is how much of the item is in stock 
   
    //constuctors
    public GroceryItem(String inName, double inCost, int inStock){
        name = inName;  //
        cost = inCost;  //if there is a sale on item or if the cost of it rises then the price will reflect the change
        itemStock = inStock; // as items are bought or sold the number in stock will reflect 
    }
    
    //methods
    
    
    
}
