package system;
import java.util.Random;

/**
 * The utility class stores functions that may be used in any other classes.
 */
public class Utilty {

    /**
     * Generates a random integer between the lower and upper bound.
      * @param lower
     * @param upper
     * @return
     */
    public static int generateRandomInt(int lower, int upper) {
        Random random = new Random();
        return random.nextInt(upper - lower) + lower;
    }
}
