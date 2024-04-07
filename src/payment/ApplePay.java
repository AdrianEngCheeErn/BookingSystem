package payment;

/**
 * This class is one of the payment option that the user can choose from.
 */
public class ApplePay extends Payment{

    double limit;

    /**
     * Constructor, sets the limit of the payment option to 1000
     *
     */
    public ApplePay(){
        this.limit = 1000.0;
    }


    /**
     * Checks if the amount being added by the user is within the limit, returns a boolean.
     *
     * @param amount
     * @return boolean
     */
    @Override
    public boolean processPayment(double amount){
        if(amount > this.limit){
            System.out.println("Limit exceeded for payment of $" + String.format("%.2f", amount));
            return false;
        }
        else{
            System.out.println("Payment processed by ApplePay: $" + String.format("%.2f", amount));
            return true;
        }
    }


    /**
     * Displays the payment name in the menu
     * @return a String object
     */
    public String toString(){
        return "Apple Pay";
    }
}
