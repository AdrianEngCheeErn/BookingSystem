public class Vehicle {
    private String brand;
    private int year;
    private float price;

    public Vehicle(){
    }
    @Override
    public String toString() {
        return "The vehicle is a " + this.brand + "which was made at " + this.year +", and it costs" + this.price;
    }
}
