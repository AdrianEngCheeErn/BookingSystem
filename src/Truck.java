public class Truck extends Vehicle{
    private float loading;

    public Truck(String brand, int year, float price, float loading){
        super(brand, year, price);
        this.loading = loading;
    }
    @Override
    public String toString() {
        return super.toString() + this.loading;
    }
}
