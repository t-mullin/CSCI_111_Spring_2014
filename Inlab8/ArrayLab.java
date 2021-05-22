
/**
 *Lab to get comfortable with handling arrays.
 * 
 * @author Tristan Mullin 
 * @version 19 March 2014
 */
public class ArrayLab
{
    private int[] array; // saves the array
    public ArrayLab(int inElementNum) {  
       // sets array size to equal number of elements inputed.
       array = new int[inElementNum];
    }
    
    public void initialize() {
        for(int i = 0; i < array.length; i++){
            // sets array element to a value between 0 and 10
            array[i] = (int) (Math.random() * 11);
        }
    }
    
    public void print() {
        for(int i = 0; i < array.length; i++){
            //prints the array
            System.out.print(array[i] + ",");
        }
        System.out.println("\n");
    }
    
    public void printStat(){
        double avg = 0; // stores the average
        int max = 0;    // stores the maximum value
        int min = 10;   // stores the minimum value
        for(int i = 0; i < array.length; i++){
            avg += array[i];    //sums the array values
            // checks each number for the maximum value
            if (max < array[i]){
                max = array[i]; 
            // checks for the minimum value
            } else if (min > array[i]){
                min = array[i];
            }   
        }
        // prints the values
        System.out.println("Average Value: " + (avg/array.length));
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
    
    public void search(int inParameter) {
        boolean numCheck = false; // a flag
        for(int i = 0; i < array.length; i++){
            // checks to see if array element is equal to the parameter
            if(array[i] == inParameter){
                // sets the flag
                numCheck = true;
            } 
        }
        // if the flag was set then print
        if(numCheck == true) {
            System.out.println(inParameter + " was found.");
        } else { // if the flag was not set then print
            System.out.println(inParameter + " was not found.");
        }
    }
}
