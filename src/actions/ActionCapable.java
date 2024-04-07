package actions;
import actions.Action;
import java.util.ArrayList;

/**
 * The ActionCapable interface provides a blueprint for all the action related subclasses that implements this interface. It currently consists of the method allowableActions.
 */
public interface ActionCapable {
    /**
     * @return a reference to an ArrayList object that contains Action objects.
     */
    public ArrayList<Action> allowableActions();
}
