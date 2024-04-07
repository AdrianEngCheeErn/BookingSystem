package vehicles;
import actions.*;
import booking.*;
import system.*;
import java.util.ArrayList;


/**
 * The Vehicle abstract class provides a blueprint for all vehicles to extend
 */
public abstract class Vehicle implements ActionCapable{
    private String brand;
    private int year;
    private float price;
    private String ID;


    /**
     * Constructor
     *
     * @param brand
     * @param year
     * @param price
     * @param lowerBound
     * @param upperBound
     */
    public Vehicle(String brand, int year, float price, int lowerBound, int upperBound){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.ID = this.brand + Utilty.generateRandomInt(lowerBound, upperBound);
    }


    /**
     * Returns information regarding the vehicle's attribute
     *
     * @return a String object
     */
    @Override
    public String toString() {
        return "Booking Detail: " + this.ID + " | ID Brand: " + this.brand +" Year: " + this.year + " Price: $" + String.format("%.2f", this.price) + " per day ";
    }


    /**
     * Retrieves the price of the vehicle
     * @return a float
     */
    public float getPrice(){
        return price;
    }


    /**
     * Gather all the allowable actions that the vehicle can perform
     *
     * @return an ArrayList of Action objects
     */
    @Override
    public ArrayList<Action> allowableActions() {
        ArrayList<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }
}
