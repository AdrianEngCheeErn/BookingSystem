public class Vehicle {
    private String brand;
    private int year;
    private double price;

    public Vehicle(String brand, int year, double price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + "\n" +"Year: " + this.year + "\n" + "Price: $" + String.format("%.2f", this.price) + " per day";
    }
}
