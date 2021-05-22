/**
 * builds a word puzzle.
 * 
 * @author Tristan Mullin 
 * @version 7 April 2014
 */

import java.util.*;

public class BuildWS
{
    Scanner in = new Scanner(System.in);    //new instance of the Scanner Class
    private int row;            //stores the amount of rows
    private int column;         //stores the amount of columns
    private char[][] array;     //stores the array
    private ArrayList<String> wordList;     //arraylist of inputed words
    
    public void build(){
        boolean endCheck = false;
        wordList = new ArrayList<String>(); // creates a new arraylist
        String word = "";   // stores the inputed word
        
        //prompts user for the rows and columns
        System.out.println("How many rows would you like? >");
        row = in.nextInt();
        System.out.println("How many columns would you like? >");
        column = in.nextInt();
        
        // loops until end check is true
        while(endCheck != true) {
            // builds the array and sets endCheck to true
            if(word.equals("end")){
                buildArray();
                endCheck = true;
            } else {
                //prompts for word
                System.out.print("Add a word to your search (end to stop) >");
                word = in.next();
                    //as long as the word != end add word to arraylist
                    if(!word.equals("end")){
                        wordList.add(word);
                    }
            }
        }// end of while loop
    }// end of build method
    
    public void buildArray() {
        //a placeholder char
        char placeholder = '1';
        //loops through the array and filling it with the placeholder char
        array = new char[row][column];  //creates the array
            for(int r = 0; r < row; r++){
                for(int c = 0; c < column; c++) {
                    array[r][c] = placeholder; 
                }
            }
            //calls the methods
            randomInsert();
            replacePlaceholder(placeholder);
            printArray();
        }//end of buildArray
        
    public void replacePlaceholder(char inHolder) {
        //runs through array and replaces what ever is the placeholder
        String alph = "abcdefghijklmnopqrstuzwxyz";
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < column; c++) {
                if(array[r][c] == inHolder) {
                    array[r][c] = alph.charAt((int)(26*Math.random())); //places a random char in to the array
                }
            }
        }
    }//end of replacePlaceholder method
    
  
    public void printArray() {
        //prints the array
        for(int i = 0; i < row; i++) {
            for(int r = 0; r < column; r++) {
                System.out.print(array[i][r]);
            }
            System.out.println();
        }
    }//end of printArray
    
    public void randomInsert(){
        //use the arraylist size for the loop
        for(int i = 0; i < wordList.size(); i++) {
            //gets the word at index i
            String wordFromList = wordList.get(i);
            // random num between 1 and 3
            int num = (int)(3*Math.random()+1);
            //uses num for which method to call to place the word
            if(num == 1){
                placeRight(wordFromList);
            } 
            if(num == 2){  
                placeDown(wordFromList);
            }
            if(num == 3){  
                placeDiagonal(wordFromList);
            } 
        }
    }//end of randomInsert 
    
    public void placeRight(String inWord) {
        boolean placed = false; 
        //while placed does not equal true loop again
        while (!placed) {
            int r = (int)(row*Math.random());       //random row
            int c = (int)(column*Math.random());    //random column
            
            // passes in the row, column and word into the check method
            if(checkRight(r, c, inWord)) {
                //if check method returns true
                placed = true; 
                // place the word into the array
                for (int i = 0; i < inWord.length(); i++){
                    array[r][c+i] = inWord.charAt(i);
                }
            }
        }
    }//end of placeRIght method
    
    public boolean checkRight(int r, int c, String newWord) {
        //checks to see if the word will fit the row
        if (c + newWord.length() > array[r].length) {
            return false;
        }
        //checks the array for letter mismatches and placeholders
        for(int i = 0; i <  newWord.length(); i++) {
            if(array[r][c + i] != newWord.charAt(i) && array[r][c + i] != '1') {
                return false;
            }
        }
        return true;
    }// end of checkRight method
    
    public void placeDown(String inWord) {
        boolean placed = false;
        //while placed does not equal true loop again
        while(!placed) {
            int r = (int)(row*Math.random());       //random row
            int c = (int)(column*Math.random());    //random column
             // passes in the row, column and word into the check method
            if(checkDown(r, c, inWord)) {
                //if check method returns true
                placed = true;
                // place the word into the array
                for(int i = 0; i < inWord.length(); i++) {
                    array[r + i][c] = inWord.charAt(i);
                }
            }
        }
    }//end of placeDown method
    
    public boolean checkDown(int r, int c, String newWord) {
        //checks to see if the word will fit into the column
        if (r + newWord.length() > array.length) {
            return false;
        }
        //checks the array for letter mismatches and placeholders
        for(int i = 0; i <  newWord.length(); i++) {
            if(array[r + i][c] != newWord.charAt(i) && array[r + i][c] != '1') {
                return false;
            }
        }
        return true;
    }//end of checkDown method
    
    public void placeDiagonal(String inWord) {
        boolean placed = false;
        //while placed does not equal true loop again
        while(!placed) {
            int r = (int)(row*Math.random());       //random row
            int c = (int)(column*Math.random());    //random column
             // passes in the row, column and word into the check method
            if(checkDiagonal(r, c, inWord)) {
                //if check method returns true
                placed = true;
                // place the word into the array
                for(int i = 0; i < inWord.length(); i++) {
                    array[r + i][c + i] = inWord.charAt(i);
                }
            }
        }
     }//end of placeDiagonal method
    
     public boolean checkDiagonal(int r, int c, String newWord) {
        //checks to see if the word will fit into the rows and columns
        if (r + newWord.length() > array.length || c + newWord.length() > array[r].length) {
            return false;
        }
        //checks the array for letter mismatches and placeholders
        for(int i = 0; i <  newWord.length(); i++) {
            if(array[r + i][c + i] != newWord.charAt(i) && array[r + i][c + i] != '1') {
                return false;
            }
        }
        return true;
    }//end of checkDiagonal method
    
}
