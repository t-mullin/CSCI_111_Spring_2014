
/**
 * The driver for ArrayLab.
 * 
 * @author Tristan Mullin 
 * @version 19 March 2014
 */
public class Driver
{
    public static void main(String[] args) {
        ArrayLab array1 = new ArrayLab(10);
        
        array1.print();
        array1.initialize();
        array1.print();
        array1.printStat();
        array1.search(3);
        array1.search(2);
    }
}
