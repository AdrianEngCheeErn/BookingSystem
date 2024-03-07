public class Sedan extends Vehicle{
    private int range;
    private String engineType;

    public Sedan(String brand, int year, double price, int range, String engineType){
        super(brand, year, price);
        this.range = range;
        this.engineType = engineType;
    }
    @Override
    public String toString() {
        return super.toString() + "\nRange: " + this.range + " km" + "\n" + "Engine Type: " + this.engineType;
    }
}
