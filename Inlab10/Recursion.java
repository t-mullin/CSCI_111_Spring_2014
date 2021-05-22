/**
 * Inlab 10: Recursion
 * 
 * @author yaw 
 * @version 1 April 2014
 */
public class Recursion
{
    public static void print(int[] array)
    {
        for(int i = 0; i < array.length; i++){// loops through array length - 1
            if(i == array.length - 1) {
                System.out.print(array[i]);//print out the array
            } else {
                System.out.print(array[i]+ ",");//print out the array
            }
        }
        System.out.println();
    }
    
    public static int largest(int[] array)
    {
        return largestFrom(array, 0);
    }
    
    private static int largestFrom(int[] array, int start)
    {
        //base case is when start equals the length of the array minus one
        if(start == array.length-1){
            return array[start];
        } else {
            //uses the the static max method from the math class to compare for the largest value in the array
            return Math.max(array[start], largestFrom(array, start+1));
        }
    }
    
    public static int smallest(int[] array)
    {
        return smallestFrom(array, 0);
    }
    
    private static int smallestFrom(int[] array, int start)
    {
        //base case is when start equals the length of the array minus one
        if(start == array.length-1){
            return array[start];
        } else {
            //uses the the static min method from the math class to compare for the smallest value in the array
            return Math.min(array[start] , smallestFrom(array, start+1));
        }       
    }
}