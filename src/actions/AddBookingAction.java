package actions;
import booking.*;
import system.*;

import actions.Action;

/**
 * The AddBookingAction class is used to allow the user to add a booking to their bookings list.
 */
public class AddBookingAction implements Action {
    private Booking myBooking;


    /**
     * Constructor
     * @param myBooking
     */
    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    /**
     * adds a booking to the user's booking list
     *
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user) {
        user.addBookings(myBooking);
        return myBooking + " is successfully added to the Booking System!";
    }

    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription() {
        return "Add the following vehicle to the Booking System: " + myBooking;
    }

}