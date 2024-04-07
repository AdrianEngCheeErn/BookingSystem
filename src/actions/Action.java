package actions;
import system.*;
import booking.*;

/**
 * The Action interface provides a blueprint for all the action related subclasses that implements this interface. It currently consists of two methods execute and menuDescription.
 */
public interface Action {
    /**
     * @param user a user object
     * @return a reference to a String object
     */
    String execute(User user)
    ;

    /**
     * @return a reference to a String object
     */
    public String menuDescription();
}