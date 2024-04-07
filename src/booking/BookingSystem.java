package booking;
import enums.EngineType;
import system.*;
import actions.Action;
import actions.ActionCapable;
import vehicles.SUV;
import vehicles.Sedan;
import vehicles.Truck;
import vehicles.Vehicle;
import java.util.ArrayList;
import java.util.*;


/**
 * The BookingSystem class handles most of the displays that the user will be viewing, it will also stop displaying once the user exits the system.
 */
public class BookingSystem {
    private ArrayList<Vehicle> vehicleArray;

    private ArrayList<Vehicle> vehicleRentals;

    User user;

    /**
     * Constructor
     */
    public BookingSystem(){
        this.vehicleArray = new ArrayList<>();
        this.user = new User();
        this.vehicleRentals = new ArrayList<>();
    }

    /**
     * Shows the header and footer of the display
     */
    public void printStatus() {
        System.out.println("Welcome to FIT2009 booking.Booking System");
        createVehicles();
        consoleMenu();
        System.out.println("Thank you for visiting FIT2009 booking.Booking System!");
    }

    /**
     * Creates the 6 main vehicle that the user can choose to book.
     */
    public void createVehicles() {
        // create instances of vehicles object
        Vehicle lexus = new Sedan("Lexus", 2023, (float)200.00, 500, EngineType.ELECTRIC);
        Vehicle bmw = new Sedan("BMW", 2022, (float)150.00, 600, EngineType.PETROL);
        Vehicle tesla = new SUV("Tesla", 2023, (float)300.00, 5, EngineType.ELECTRIC);
        Vehicle mercedes = new SUV("Mercedes", 2020, (float)500.00, 7, EngineType.DIESEL);
        Vehicle ford = new Truck("Ford", 2019, (float)400.00, 1.0);
        Vehicle volkswagen = new Truck("Volkswagen", 2020, (float) 450.00, 1.2);

        // Add vehicles to the vehicleRentals list
        vehicleRentals.add(lexus);
        vehicleRentals.add(bmw);
        vehicleRentals.add(tesla);
        vehicleRentals.add(mercedes);
        vehicleRentals.add(ford);
        vehicleRentals.add(volkswagen);

        // final list of vehicle rentals
        vehicleArray.addAll(vehicleRentals);
    }


    /**
     * Displays the main content of the system, allowing users to execute actions.
     */
    public void consoleMenu() {
        User user = new User();
        while (!user.getUserDone()) {
            List<Action> actions = new ArrayList<>();
            List<ActionCapable> actionCapables = new ArrayList<>();
            actionCapables.add(user);
            actionCapables.addAll(vehicleRentals);
            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }


            System.out.println("#########################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(user));
        }
    }
}