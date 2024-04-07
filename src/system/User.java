package system;
import payment.*;
import actions.*;
import booking.Booking;

import java.util.ArrayList;

/**
 * The user class represents the user of the system and tracks their balance and bookings, as well an attribute to exit the system.
 */
public class  User implements ActionCapable {
    float balance;
    boolean isUserDone;
    private ArrayList<Booking> bookings = new ArrayList<>();


    /**
     * Returns the user's balance
     * @return a float of the user's balance
     */
    public float getBalance(){
        return balance;
    }

    /**
     * Changes the user's balance
     * @param newBalance
     */
    public void setBalance(float newBalance){
        balance = newBalance;
    }

    /**
     * Adds the amount in the parameter to the user's current balance
     * @param money
     */
    public void addBalance(float money){
        balance += money;
    }

    /**
     * Retrieves the isUserDone private attribute
     * @return boolean value
     */
    public boolean getUserDone(){
        return isUserDone;
    }

    /**
     * Set the isUserDone private attribute
     * @param newUserDone
     */
    public void setUserDone(boolean newUserDone){
        isUserDone = newUserDone;
    }

    /**
     * Adds a booking to the user's booking list
     * @param booking
     */
    public void addBookings(Booking booking){
        bookings.add(booking);
    }


    /**
     * Retrieves user's bookings
     * @return an ArrayList of Booking objects
     */
    public ArrayList<Booking> getBookings(){
        return bookings;
    }

    /**
     * Display the user's bookings
     */
    public void displayBookedVehicles() {
        if (bookings.isEmpty()) {
            System.out.println("No vehicles booked.");
        } else {
            System.out.println("Booked vehicles:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    /**
     * Gather all the allowable actions that the user can perform
     * @return an ArrayList of Action Objects
     */
    @Override
    public ArrayList<Action> allowableActions() {
        ArrayList<Action> actions = new ArrayList<>();
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new GooglePay());
        payments.add(new ApplePay());
        actions.add(new AddBalanceAction(payments));
        // Add other actions here if needed
        actions.add(new ViewBalanceAction());
        actions.add(new DisplayBookingAction());
        actions.add(new ConfirmAction());
        for (Booking booking: bookings){
            actions.add(new RemoveBookingAction(booking));
        }
        actions.add(new ExitAction());
        return actions;
    }
}
