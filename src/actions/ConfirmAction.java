package actions;
import system.*;
import booking.*;
import actions.Action;

/**
 * The ConfirmAction class allows users to confirm their bookings, which decreases their balance base on the bookings in their bookings list, as well as clears their bookings list after.
 */
public class ConfirmAction implements Action {


    /**
     * Constructor
     */
    public ConfirmAction(){
    }

    /** Reduce the total balance of the user base on their bookings, do nothing if the user does not have enough balance.
     *
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user) {
        float totalBalance = 0;
        for (Booking booking : user.getBookings()) {
            totalBalance += booking.getVehicle().getPrice();
        }
        if(totalBalance > user.getBalance()){
            return "Not enough balance.";
        }
        user.setBalance(user.getBalance() - totalBalance);
        user.getBookings().clear();
        return "Bookings confirmed. A total price of $" + String.format("%.2f", totalBalance) + " has been deducted from your balance. You have $" + String.format("%.2f", user.getBalance()) + " remaining. Thank you for using FIT2099 booking.Booking System";
    }

    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription(){
        return "Confirm bookings.";
        }
}
