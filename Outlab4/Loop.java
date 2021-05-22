
/**
 * Practice using for and while loops in conjunction with int and char.
 * 
 * @author Tristan Mullin 
 * @version 27 Feb 2014
 */
public class Loop
{
    //constructor
    public Loop () {
    
    }
    
    public void loop1(int lb, int ub, int incr) {
        System.out.println("Loop 1 output (lb = " + lb + 
                           ", ub = " + ub + ", incr = " 
                           + incr + ")");
        //adds one to the lower bound until it is <= to the upper bound
        for(lb = lb; lb <= ub; lb += incr){
            System.out.println(lb);
        }
        System.out.println("-------------------------------");
    }
    
    public void loop2(int lb, int ub, int incr) {
        System.out.println("Loop 2 output (lb = " + lb + 
                           ", ub = " + ub + ", incr = " 
                           + incr + ")");
        //while lower bound is <= upper bound, add the incr to lb
        while(lb <= ub) {
            System.out.println(lb);
            lb += incr;
        }
        System.out.println("-------------------------------");
    }
    
    public void loop3() {
        String alph = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("Loop 3 Output: ");
            //a one loop solution
            //loops the addition of each char to the previous char
            //for(int p = 1; p <= alph.length(); p++) {
            //System.out.println(alph.subSequence(0, p));
            //}
         // loops 26 times starting from 26 going down to 0
         for(int i = alph.length(); i >= 0; i--) {
             // sets c = to i and loops until c is 25
             for (int c = i; c < alph.length(); c++) {
             System.out.print(alph.charAt(-i + c));
             }
             //prints each line of the alphabet
             System.out.println(); 
         }
        System.out.println("-------------------------------");
    }
    
    public void loop4(int val) {
        int valCount = 0;// stores the amount of times val is == to num
        for (int loopCount = 0; loopCount <= 10; loopCount++) {
            //generates random number between 1 and 10
            int num = (int)(10*Math.random()+1);
            //checks for equivalance
            if (val == num) {
                //adds one to valCount
                valCount++;
            }
        }
        System.out.println("Loop 4 Output:\n" + val + 
                           " was found " + valCount +
                           " times.");
        System.out.println("-------------------------------");
    }
    
    public void loop5(int val) {
        int numCount = 0; // stores each hit of the number 
        int loopCount = 0; // stores howmany times it toop to roll val five times
        while (numCount < 5) {
            //generates random number between 1 and 10
            int num = (int)(10*Math.random()+1);
                //checks for equivalance
                if (val == num) {
                    numCount++;
                }
            loopCount++;
        }
        System.out.println("Loop 5 Output:\nIt took " + 
                           loopCount + " iterations to generate " 
                           + val + " five times.");
        System.out.println("-------------------------------");
    }
    
}
