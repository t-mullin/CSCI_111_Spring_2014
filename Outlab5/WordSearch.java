
/**
 * searches for words in a word puzzle.
 * 
 * @author Tristan Mullin 
 * @version x March 2014
 */
import java.util.*;
import java.lang.String;

public class WordSearch
{
    Scanner in = new Scanner(System.in);
    private char[][] wordPuzzle; //holds the word puzzle
    private String word;    // holds the user's word
    
    public WordSearch(char[][] inArray)
    {
       wordPuzzle = inArray; // takes in the array from the driver, then stores in a global variable
    }
    
    public void play(){
        boolean endCheck = false; // used to determine if the while loop to terminate
        
        while (endCheck != true) {
            
            printBoard(); // calls the method to print the word puzzle board 
        
            System.out.println("\nWhat word do you want to search for? (Type end to quit)");
            word = in.next(); // prompts the user for a word
                // if the word equals end, then trigger the boolean to flip and terminate the loop
                if (word.equals("end")) {
                    endCheck = true;
                } else { 
                    //if the word does not equal end then seach for the user's word
                    search(word); 
                    System.out.println();
                }
        }// end of while statement
    }
    
    public void printBoard() { 
        // finds the amount of rows that are contained in the 2d array to loop through
        for(int i = 0; i < wordPuzzle.length; i++){
            //uses the row length to find amount of columns in the word puzzle
            for(int r = 0; r < wordPuzzle[i].length; r++){
                //prints one line of the word puzzle
                System.out.print(wordPuzzle[i][r]);
            }
            //returns to the next line until loop is done
            System.out.println();
        }
    }
    // to check if each row contains the user imputed word
    public void search(String inWord){
        boolean found = false; // 
        //loop through the arrays row length
        for(int i = 0; i < wordPuzzle.length; i++) {
            // loop through the column length in terms of array length
            for(int j = 0; j < wordPuzzle[i].length; j++) {
                // if the char at i, j in the array equals the first char of the word then execute the code bellow
                if (wordPuzzle[i][j] == inWord.charAt(0)) {
                    //calls the findRight method with the entrie row and the index of the column 
                    if(findRight(wordPuzzle[i], j)){
                        //if the method returns true then this code is carried out
                        System.out.println(word + " found horizontally at row " + i + " and column " + j +"!");
                        found = true;
                    }
                    //calls the findDown method with the index of the row and column
                    if(findDown(i ,j)){
                        //if the method returns true then this code is carried out
                        System.out.println(word + " found vertically at row " + i + " and column " + j + "!");
                        found = true;
                    }
                    //calls the findDiagonal method with the index of the row and column
                    if(findDiagonal(i, j)) {
                        //if the method returns true then this code is carried out
                        System.out.println(word + " found diagonal at row " + i + " and column " + j + "!");
                        found = true;
                    }
                }
            }
        }
        //if found still equals false
        if(!found) {
            //print that the word was not found
            System.out.println(word + " not found!");
        }
    }
    
    public boolean findRight(char[] inArray, int c) {
        //creates a new string from the row
        String row = new String(inArray);
        boolean rFlag = false;
        //out of bounds exception handler
        if (c + word.length() <= row.length()) {
            //creates a string from the array, that starts at column j and is as long as the user's word
            String subRow = new String(inArray, c, word.length()); 
            //checks to see if the word that is contained in the sub row equals the word
            if (subRow.equals(word)) {
                rFlag = true;
            }
        }
       return rFlag;
    }
    
    public boolean findDown(int r, int c) {
        //loops through the length of the inputed word
        for(int i = 1; i < word.length(); i++) {
            //checks for out of bounds exeptions then returns false
            if(r + i >= wordPuzzle.length) {
                return false;
            }
            //checks to see if the letters equal if not then return false
            if(word.charAt(i) != wordPuzzle[r + i][c]) {
                 return false;
            }
        }
        //if neither of the if statemennts are returned then true is returned
        return true;
    } 
    
    public boolean findDiagonal(int r, int c) {
        //loops through the length of the inputed word
        for(int i = 1; i < word.length(); i++) {
            //checks for out of bounds exeptions then returns false
            if(r + i >= wordPuzzle.length || c + i >= wordPuzzle[r].length) {
                return false;
            }
            //checks to see if the letters equal if not then return false
            if(word.charAt(i) != wordPuzzle[r + i][c + i]) {
                return false;
            }
        }
        //if neither of the if statemennts are returned then true is returned
        return true;
    } 
}

