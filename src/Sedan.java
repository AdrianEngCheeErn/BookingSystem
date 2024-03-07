public class Sedan extends Vehicle{
    private int range;
    private String engineType;

    public Sedan(){
        super();
    }
    @Override
    public String toString() {
        return "The vehicle is a " + super.brand + "which was made at " + this.year +", and it costs" + this.price;
    }
}
