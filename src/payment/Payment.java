package payment;

/**
 * An abstract class that provides a blueprint for all payment options
 */
public abstract class Payment {

    /**
     * An abstract method that needs to be overridden by subclasses that extends it.
     *
     * @param amount
     * @return a boolean value
     */
    public abstract boolean processPayment(double amount);
}
