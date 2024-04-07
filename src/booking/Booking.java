package booking;
import vehicles.Vehicle;

/**
 * The booking class represents individual bookings of vehicles that can be made by the user.
 */
public class Booking {
    private Vehicle vehicle;


    /**
     * Constructor
     *
     * @param vehicle
     */
    public Booking(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * Return the toString string object of the vehicle in the private attribute.
     *
     * @return a String object
     */

    public String toString(){
        return this.vehicle.toString();
    }

    /**
     * Return the vehicle private attribute
     *
     * @return Vehicle object
     */
    public Vehicle getVehicle(){
        return vehicle;
    }
}
