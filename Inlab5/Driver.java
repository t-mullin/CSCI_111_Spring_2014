
/**
 * Prints what a person can do.
 * 
 * @author Tristan Mullin) 
 * @version 12 Feb 2014
 */
public class Driver {
    public static void main (String [] args) {
        //creates new instances of the person class
        Person person1 = new Person("Dan", 17);
        Person person2 = new Person("Steve", 25);
        Person person3 = new Person("Sally", 80);
        
        //prints out the persons name, age, and what they can do
        System.out.println("Testing for Denny's discount menu.");
        System.out.println("-----------------------------");
        person1.determineActivities();
        System.out.println();
        person2.determineActivities();
        System.out.println();
        person3.determineActivities();
    }
}
