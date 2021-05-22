
/**
 * The shoppers cart.
 * 
 * @author Tristan Mullin 
 * @version 2 Feb 2014
 */
public class Cart
{
    // instance variables - replace the example below with your own
   private String shoppersName; //  the shoppers name
   private int item1Quantity;   //  the quantity of the items in the cart
   private int item2Quantity;   
   
   private double unitTotal1; // the totals for item quantity * items cost
   private double unitTotal2;
   
   private double subTotal; // the sum of the unitTotals 
   private double tax;      // the tax for the items in the cart
   private double cartTotal;    // the total cost of the items in the cart plus the tax
   
   private GroceryItem newItem1; 
   private GroceryItem newItem2; 
   
   private static int numOfCarts; //counts the number of carts
   
   //constructor
   public Cart(String inName){
       shoppersName = inName;
       numOfCarts++;
   }
   //methods
   // sets the item, the quantity of item, the unittotal, and updates the stock
   public void addItem1(GroceryItem item, int newQuantity) {
       newItem1 = item;
       item1Quantity = newQuantity;
       unitTotal1 = item1Quantity * newItem1.getCost();
       newItem1.updateNumInStock(-item1Quantity);
   }
   
   public void addItem2(GroceryItem item, int newQuantity) {
       newItem2 = item;
       item2Quantity = newQuantity;
       unitTotal2 = item2Quantity * newItem2.getCost();
       newItem2.updateNumInStock(-item2Quantity);
       
   }
   // sets the values to subtotal, tax, and carttotal
   public void updateCost() {
        subTotal = unitTotal1 + unitTotal2;
        tax =  subTotal * .07;
        cartTotal = subTotal + tax;
        
   }
   
   // prints the shoppers receipt
   public void printReceipt(){
       updateCost();
       System.out.println("Shopper name: " + shoppersName);
       System.out.println("--------------------------");
       System.out.println(newItem1.getName() + ": " + item1Quantity + " units at $" + newItem1.getCost() + " per units = $" + unitTotal1);
       System.out.println(newItem2.getName() + ": " + item2Quantity + " units at $" + newItem2.getCost() + " per units = $" + unitTotal2 );
       System.out.println("   ----> Subtotal = $" + subTotal );
       System.out.println("   ----> 7% tax = $" + tax );
       System.out.println("   ----> Total = $" + cartTotal);
   }
   // returns the number of carts
   public static int getNumberOfCarts() {
       return numOfCarts;
   }
   
}
