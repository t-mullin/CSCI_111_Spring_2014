
/**
 * determines what a person can do.
 * 
 * @author Tristan Mullin 
 * @version 12 Feb 2014
 */
public class Person {
    // instance variables - replace the example below with your own
   private String name; // stores a persons name
   private int age;     // stores a persons age
   
   //set the persons name and age
   public Person(String inName, int inAge) {
       name = inName;
       age = inAge;
   }
   //determines what a person can do in context of their age
   public void determineActivities() {
       System.out.println(name + ", you are " + age + " years old.");
    if (age >= 25) {
        System.out.println("You can rent a car at regular price.");
    } else {
        System.out.println("You cannot rent a car at regular price.");
    }
    
    if (age <= 16 || age > 75) {
        System.out.println("You get a discount menu at Denny's.");
    } else {
        System.out.println("You have to pay full price at Denny's.");
    }
    
    if ( age >= 16 && age < 18) {
        System.out.println("You can drive, but you cannot vote.");
    }
    
   }
}
