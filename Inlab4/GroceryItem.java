/**
 * GroceryItem Inlab4.
 * 
 * @author yaw 
 * @version 04 Feb 2014
 */
public class GroceryItem
{
    private String name;        //item name
    private double cost;        //cost of 1 unit of item
    private int numInStock;     //number of units of item in stock
    
    // constructor for GroceryItems
    public GroceryItem(String inName, double inCost, int inNumInStock)
    {
        name = inName;
        cost = inCost;
        numInStock = inNumInStock;
    }
    
    // changes the number in stock by adding the parameter 'change' to the current numInStock
    public void updateNumInStock(int change)
    {
        numInStock += change;
    }
    
    // returns the item's name
    public String getName()
    {
        return name;
    }
    
    // returns the cost of 1 item
    public double getCost()
    {
        return cost;
    }
    
    // prints the number of units of item in stock
    public void printInventory()
    {
        System.out.println("There are " + numInStock + " units of " + name + " in stock");
    }
}