public class Vehicle {
    private String brand;
    private int year;
    private float price;

    public Vehicle(String brand, int year, float price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "The vehicle is a " + this.brand + "which was made at " + this.year +", and it costs" + this.price;
    }
}
