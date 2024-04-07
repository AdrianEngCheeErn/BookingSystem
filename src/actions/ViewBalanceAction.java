package actions;
import system.*;
import booking.*;
import actions.Action;

/**
 * The ViewBalanceAction class allows user to view the current balance that they have.
 */
public class ViewBalanceAction implements Action {

    /**
     * Constructor
     */
    public ViewBalanceAction(){

    }

    /**
     * Displays the user's current balance
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user){
        return "You have a balance of $" + String.format("%.2f", user.getBalance());
    }


    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription(){
        return "View Balance.";
    }
}
