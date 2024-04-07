package vehicles;
import enums.EngineType;

/**
 * The SUV is a subclass of Vehicle
 */
public class SUV extends Vehicle {
    private int seats;
    private EngineType engineType;

    /**
     * Constructor
     *
     * @param brand
     * @param year
     * @param price
     * @param seats
     * @param engineType
     */
    public SUV(String brand, int year, float price, int seats, EngineType engineType){
        super(brand, year, price, 1000, 9999);
        this.seats = seats;
        this.engineType = engineType;
    }

    /**
     * Returns information regarding the SUV's attributes
     *
      * @return a String object
     */
    @Override
    public String toString() {
        return super.toString() + "Number of Seats: " + this.seats + " Engine Type: " + this.engineType;
    }
}
