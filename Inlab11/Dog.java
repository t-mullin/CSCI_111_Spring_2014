
/**
 * Sub class of the mammal class.
 * 
 * @author Tristan Mullin 
 * @version 14 April 2014
 */
public class Dog extends Mammal
{
   
    private String breed; //stores the breed
    
    public Dog(String name, String breed)
    {
        //takes in a name and breed
        //sends the name to the pet class
        super.setName(name);
        this.breed = breed;
    }
    
    public String getName() {
        //returns the string
        return "The dog's name is " + name + " and it's a " + breed;
    }
}
