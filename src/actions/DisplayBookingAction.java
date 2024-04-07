package actions;
import system.*;
import booking.*;
import actions.Action;

/**
 * The DisplayBookingAction class allows the user to see all the vehicles that they have booked.
 */
public class DisplayBookingAction implements Action {


    /**
     * Constructor
     */
    public DisplayBookingAction(){

    }

    /**
     * Displays all the booked vehicles in the user's bookings list.
     *
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user){
        user.displayBookedVehicles();
        return "Displayed booking action";

    }


    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription(){
        return "View bookings";
    }
}
