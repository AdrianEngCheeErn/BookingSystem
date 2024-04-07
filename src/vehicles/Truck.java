package vehicles;
import enums.EngineType;
import vehicles.Vehicle;

/**
 * The Truck is a subclass of Vehicle
 */
public class Truck extends Vehicle {
    private double loading;


    /**
     * Constructor
     *
      * @param brand
     * @param year
     * @param price
     * @param loading
     */
    public Truck(String brand, int year, float price, double loading){
        super(brand, year, price, 100, 999);
        this.loading = loading;
    }

    /**
     * Returns information regarding the Truck's attributes
     *
      * @return a String object
     */
    @Override
    public String toString() {
        return super.toString() + "Loading: " +this.loading+ "tonnes";
    }
}
