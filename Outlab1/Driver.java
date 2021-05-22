/**
 * Driver for the Stock class (outlab 1).
 * 
 * @author yaw 
 * @version 13 Jan 2014
 */
public class Driver
{
    /**
     * Main method for outlab 1.  Creates 3 instances of Stock
     * and prints information about them.
     */
    public static void main(String[] args)
    {
        Stock apple = new Stock("APPL", 14, 538.98);
        Stock blackDiamond = new Stock("BDE", 25, 14.03);
        Stock honda = new Stock("ADR", 31, 40.38);
        
        System.out.println("Stock Portfolio:");
        printInfo(apple);
        printInfo(blackDiamond);
        printInfo(honda);
        
        honda.updateShares(40);
        System.out.println("After purchaing more shares, the new info is:");
        printInfo(honda);
    }
    
    /**
     * Prints details about a stock.
     * 
     * @param   stock   Some stock
     */
    private static void printInfo(Stock stock)
    {
        System.out.println(stock.getName() + " shares are selling for " + stock.getPrice() + " per share");
        System.out.format("---> Your %d shares have a total value of $%.2f%n%n", stock.getShares(), stock.getValue());
        
    }
}