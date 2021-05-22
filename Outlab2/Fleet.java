
/**
 * takes in four ship objects and runs them as a fleet.
 * 
 * @author Tristan Mullin 
 * @version 3 Feb 2014
 */
public class Fleet
{
    // instance variables
    // stores the ship and its' fuel
    private Ship prepareShip1; 
    private Ship prepareShip2;
    private Ship prepareShip3;
    private Ship prepareShip4;
    // constructor 
    // gets the ships info from the driver
    public Fleet(Ship ship1, Ship ship2, Ship ship3, Ship ship4){ 
       prepareShip1 = ship1;
       prepareShip2 = ship2;
       prepareShip3 = ship3;
       prepareShip4 = ship4;
    }
    //methods
    // deploys four ships
    public void deploy() {
        prepareShip1.deploy();
        prepareShip2.deploy();
        prepareShip3.deploy();
        prepareShip4.deploy();
    }
    
    //refuels four ships
    public void reFuel() {
        prepareShip1.reFuel();
        prepareShip2.reFuel();
        prepareShip3.reFuel();
        prepareShip4.reFuel();
    }
    
    
    // prints the summary of the fleets fuel consumption
    public void printSummary() {
    // stores the fleets total fuel usage
        double totalFuelUsage = prepareShip1.getFuelUsage() + prepareShip2.getFuelUsage() + prepareShip3.getFuelUsage() + prepareShip4.getFuelUsage();
        
        System.out.println("After two deployments, the " + prepareShip1.getShip() + " has used " + prepareShip1.getFuelUsage() + " fuel units.");
        System.out.println();
        System.out.println("After two deployments, the " + prepareShip2.getShip() + " has used " + prepareShip2.getFuelUsage() + " fuel units.");
        System.out.println();
        System.out.println("After two deployments, the " + prepareShip3.getShip() + " has used " + prepareShip3.getFuelUsage() + " fuel units.");
        System.out.println();
        System.out.println("After two deployments, the " + prepareShip4.getShip() + " has used " + prepareShip4.getFuelUsage() + " fuel units.");
        System.out.println();
        System.out.println("The fleet has used a total of " + totalFuelUsage + " units of fuel.");
    }
}
