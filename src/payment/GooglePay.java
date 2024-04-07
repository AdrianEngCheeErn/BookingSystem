package payment;

/**
 * This class is one of the payment option that the user can choose from.
 */
public class GooglePay extends Payment{

    /**
     * Constructor
     */
    public GooglePay(){
    }

    /**
     * Process the Payment of any amount
     * @param amount
     * @return
     */
    @Override
    public boolean processPayment(double amount){
        System.out.println("Payment processed by GooglePay: $" + String.format("%.2f", amount));
        return true;
    }

    /**
     * Displays the payment name in the menu
     * @return a String object
     */
    public String toString(){
        return "Google Pay";
    }
}
