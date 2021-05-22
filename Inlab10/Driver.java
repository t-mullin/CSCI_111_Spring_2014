/**
 * Driver for Inlab10.
 * 
 * @author yaw
 * @version 1 April 2014
 * 
 */
public class Driver
{
   public static void main(String[] args)
   {
       int[] one = {2, 4, 6, 1, 6, 3, 8};
       int[] two = {43, 76, 3, 23, 95, 23};
       int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 1};
       
       Recursion.print(one);
       System.out.println("Largest is: " + Recursion.largest(one));
       System.out.println("Smallest is: " + Recursion.smallest(one));
       System.out.println();
       
       Recursion.print(two);
       System.out.println("Largest is: " + Recursion.largest(two));
       System.out.println("Smallest is: " + Recursion.smallest(two));
       System.out.println();
       
       Recursion.print(three);
       System.out.println("Largest is: " + Recursion.largest(three));
       System.out.println("Smallest is: " + Recursion.smallest(three));
       System.out.println();
    }
}