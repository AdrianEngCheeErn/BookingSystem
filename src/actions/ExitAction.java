package actions;
import system.*;
import booking.*;
import actions.Action;


/**
 * The ExitAction class allows the user to exit the system.
 */
public class ExitAction implements Action {

    /**
     * Constructor
     */
    public ExitAction(){

    }

    /**
     * Sets the user's isUserDone attribute true, which tells the system to exit and stop running.
     *
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user){
        user.setUserDone(true);
        return "";
    }


    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription(){
        return "Exit the system.";
    }

}
