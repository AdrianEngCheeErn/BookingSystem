package system;

import booking.BookingSystem;

/**
 * The main file to start the application.
 * Created by:
 * @author Adrian Eng Chee Ern.
 */
public class Application {

    /**
     * Creates a BookingSystem object and runs the system.
     *
     * @param args
     */
    public static void main(String[] args){
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.printStatus();
    }
}

