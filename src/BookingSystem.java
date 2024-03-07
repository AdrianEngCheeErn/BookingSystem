import java.lang.reflect.Array;

public class BookingSystem {

    Vehicle[] vehicleArray = new Vehicle[6];
    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System");
        System.out.println("Thank you for visiting FIT2099 Booking System!");
    }

    public void createVehicles(){
        Sedan sedan1 = new Sedan("Lexus", 2023, 200, 500, "Electric");
        Sedan sedan2 = new Sedan("Lexus", 2023, 200, 500, "Electric");
    }
}