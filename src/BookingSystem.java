import java.lang.reflect.Array;

public class BookingSystem {
    Vehicle[] vehicleArray;

    public BookingSystem(){
        this.vehicleArray = new Vehicle[6];
    }
    public void printStatus() {
        System.out.println("Welcome to FIT2009 Booking System\n");
        this.createVehicles();
        this.displayVehicles();
        System.out.println("Thank you for visiting FIT2009 Booking System!");
    }

    public void createVehicles(){
        Sedan sedan1 = new Sedan("Lexus", 2023, 200.00, 500, "ELECTRIC");
        this.vehicleArray[0] = sedan1;
        Sedan sedan2 = new Sedan("BMW", 2022, 150.00, 600, "PETROL");
        this.vehicleArray[1] = sedan2;
        SUV suv1 = new SUV("Tesla", 2023, 300.00, 5, "ELECTRIC");
        this.vehicleArray[2] = suv1;
        SUV suv2= new SUV("Mercedes", 2020, 500.00, 7, "DIESEL");
        this.vehicleArray[3] = suv2;
        Truck truck1 =  new Truck("Ford", 2019, 400.00, 1.00);
        this.vehicleArray[4] = truck1;
        Truck truck2 =  new Truck("Volkswagen", 2020, 450.00, 1.2);
        this.vehicleArray[5] = truck2;
    }

    public void displayVehicles(){
        for (int i = 0; i < 6; i++){
            System.out.println("Booking Item " + "(" + (i + 1) + ")\n");
            System.out.println(this.vehicleArray[i].toString());
            System.out.println("\n");
        }
    }
}