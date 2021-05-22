
/**
 * subclass of the pet class.
 * 
 * @author Tristan Mullin 
 * @version 14 April 2014
*/
public class Fish extends Pet
{
    //stores a value
    private String color;
    
    public Fish(String color)
    {
        //sets the default to swimmy
        super("swimmy");
        //sets the color to the color that is passed in
        this.color = color;
    }
    
    public String getName() {
        //returns the string
        return "The fish is " + color + " and its name is " + name;
    }

}
