package actions;
import booking.*;
import system.*;
import actions.Action;

/**
 * The RemoveBookingAction class allows user to remove a booking of their choice.
 */
public class RemoveBookingAction implements Action {
    Booking booking;


    /**
     *Constructor
     *
     * @param booking
     */
    public RemoveBookingAction(Booking booking){
        this.booking = booking;
    }

    /**
     * removes all the bookings from the user's booking list
     *
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user) {
        user.getBookings().remove(booking);
        return "removed booking";
    }


    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription() {
        return "Remove the following vehicle to the Booking System:\n" + this.booking.toString();
    }
}
