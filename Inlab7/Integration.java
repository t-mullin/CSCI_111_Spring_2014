/**
 * Integration class to do numerical integration.
 * 
 * @author yaw 
 * @modified by Tristan Mullin
 * @version 26 Feb 2014
 */
public class Integration
{
    public static double numericallyIntegrate(double lb, double ub, double numRec)
    {
        double area = 0.0;
        //takes in the base divides by 2 and then adds the lowerbound
        double midpoint = ((((ub - lb)/numRec)/2)+lb);
        // stores the loopCount
        int loopCount = 0;
        // loops while the loopCount is less then the numRec
        while (loopCount < numRec) {
            // adds the area to the nth time dictated by the numRec
            area += (((ub - lb)/numRec) * (function(midpoint)));
            // updates the midpiont 
            midpoint += ((ub - lb)/numRec);
            //adds one to the loopCount
            loopCount++;
        }
        return area;
        
    }
    
    private static double function(double x)
    {
        return x * x;
    }
}