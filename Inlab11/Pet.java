/**
 * Inheritance example: This is the Parent class
 * 
 * @author Tristan Mullin 
 * @version 14 April 2014
 */
public class Pet {
   
    protected String name;  //name variable that each subclass can access
    
    public Pet(String name) {
        //constructor that sets the name
        this.name = name;
    }
    
    public void setName(String inName) {
        //method that takes in a name from a subclass and sets it
        this.name = inName;
    }
    
    public void printInfo() {
        //prints the results of the getName method
         System.out.println(getName());
    }
    
    public String getName() {
        //returns the string below
        return "The pet's name is " + name;
    }
}
