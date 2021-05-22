
/**
 * Write a description of class PetalsGame here.
 * 
 * @author Tristan Mullin 
 * @version 11 Feb 2014
 */
public class PetalsGame
{
    // instance variables 
    // stores the 5 different random dice values
    private int dice1;
    private int dice2;
    private int dice3;
    private int dice4;
    private int dice5;

    private int totalPetals; // stores the total petal count
    //Constructor(s)

    public PetalsGame() {

    } 
    //Methods
    // rolls 5 dice in a random fasion 
    public void rollDice() {
        dice1 = (int)(6*Math.random()+1);
        dice2 = (int)(6*Math.random()+1);
        dice3 = (int)(6*Math.random()+1);
        dice4 = (int)(6*Math.random()+1);
        dice5 = (int)(6*Math.random()+1);
    }
    // prints the 5 dice values
    public void printDice() {
        System.out.println("You have rolled the following: " 
            + dice1 + ", " + dice2 + ", " + 
            dice3 + ", " + dice4 + ", " + dice5
            );
    }
    //calculates the petals for one dice at a time
    public int collectPetals (int inDice) {
        if (inDice == 3 || inDice == 5) {
            inDice--;
        } else {
            inDice = 0;
        }
        return inDice;
    }
    // calculates the total petal count
    public int calculateAllPetals () {
        dice1 = collectPetals(dice1);
        dice2 = collectPetals(dice2);
        dice3 = collectPetals(dice3);
        dice4 = collectPetals(dice4);
        dice5 = collectPetals(dice5);
        totalPetals = dice1 + dice2 + dice3 + dice4 + dice5;
        return totalPetals;
    }
    //returns the total petals if the guess is wrong
    public int getPetals(){
        return totalPetals;
    }
}
