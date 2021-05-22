
/**
 * Asks the person for name and age. Then prints what they can do.
 * 
 * @author Tristan Mullin 
 * @version 19 Feb 2014
 */

import java.util.Scanner;

public class Driver {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your name >"); //asks what the person's name is
        String name = in.nextLine();    //takes in users input for name
        System.out.println(name + ", how old are you? >"); //asks the age of the person
        int age = in.nextInt();     //takes in the users input for age
       
        //creates new instances of the person class
        Person person1 = new Person(name , age);
        
        //prints out the persons name, age, and what they can do
        person1.determineActivities();
    }
}