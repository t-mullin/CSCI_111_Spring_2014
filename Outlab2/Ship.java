
/**
 * Takes in the ships name, size of fueltank and current level of fuel onboard.
 * 
 * @author Tristan Mullin 
 * @version 27 Jan 2014
 */
public class Ship {
    // instance variables
    
    private String shipType; // The type of ship that is deployed in a fleet.
    private int fuelTankSize;   // The fuel that each ship has at the start.
    private double currentFuelLevel;  // the change in fuel either consumed or added.
    private double fuelConsumed;    // stores the amount of fuel consumed
    // constuctors
    // takes in the shiptype and fuel tank size, to be set in the driver.
    public Ship(String inShip, int inFuel) {
        shipType = inShip;
        fuelTankSize = inFuel;
        currentFuelLevel = inFuel;
    }
    
    // methods
    // returns the ships type
    public String getShip() {
        return shipType;
    }
    
    // returns the ships current fuel level
    public double getFuel() {
      return currentFuelLevel;
    }
    
    // deploys the ship
    public void deploy() {
       currentFuelLevel /= 2;
       fuelConsumed = fuelTankSize - currentFuelLevel;
    }
    
    // returns the amount of fuel consumed
    public double getFuelUsage(){
        return fuelConsumed;
    }
    
    // refuels the ship
    public void reFuel() {
       currentFuelLevel = fuelTankSize;
    }
}
