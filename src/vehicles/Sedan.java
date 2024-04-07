package vehicles;
import enums.EngineType;

/**
 * The Sedan class is a subclass of Vehicle
 */
public class Sedan extends Vehicle {
    private int range;
    private EngineType engineType;

    /**
     * Constructor
     *
     * @param brand
     * @param year
     * @param price
     * @param range
     * @param engineType
     */
    public Sedan(String brand, int year, float price, int range, EngineType engineType){
        super(brand, year, price, 10000, 99999);
        this.range = range;
        this.engineType = engineType;
    }

    /**
     * Returns information regarding the Sedan's attributes
     *
     * @return a String object
     */
    @Override
    public String toString() {
        return super.toString() + "Range: " + this.range + " km " + "Engine Type: " + this.engineType;
    }
}
