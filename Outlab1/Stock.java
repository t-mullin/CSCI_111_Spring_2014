
/**
 * Program to display current stocks with number of stocks and price per stock.
 * 
 * @author Tristan Mullin 
 * @version 17 January 2014
 */
public class Stock {
    // Instance variables
    private String name;
    private double price;
    private int shares;
    
    // Constructors
    public Stock (String inName, int inShares, double inPrice) {
        name = inName;
        shares = inShares;
        price = inPrice;
    }
    // Methods
    public String getName() {
        return name;
    }
    
    public int getShares() {
        return shares;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void updateShares(int newShares) {
        shares = newShares;
    }
    
    public double getValue() {
        return shares * price;
    }
}