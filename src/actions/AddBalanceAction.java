package actions;
import system.*;
import booking.*;
import payment.*;
import actions.Action;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The AddBalanceAction class is used to allow the user to input the amount of money they want to enter into their account, as well as the payment method that they would like to use.
 */
public class AddBalanceAction implements Action{
    ArrayList<Payment> payments;

    /**
     * Constructor
     *
     * @param payments an ArrayList object that contains Payment objects
     */
    public AddBalanceAction(ArrayList<Payment> payments){
        this.payments = payments;
    }

    /**
     * Allow user to add balance to their current balance with different payment options.
     *
     * @param user a user object
     * @return a String object
     */
    @Override
    public String execute(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add to your current balance: ");
        try{
            float balance = Float.parseFloat(scanner.nextLine());
            System.out.println("Select a payment method: ");
            for(int i = 1; i < payments.size() + 1; i++){
                System.out.println(i + ") " + payments.get(i - 1));
            }
            int selection = Integer.parseInt(scanner.nextLine());
            try{
                boolean result = payments.get(selection - 1).processPayment(balance);
                if(result == true){
                    user.addBalance(balance);
                }
            }
            catch(Exception ArrayIndexOutOfBoundsException){
                System.out.println("Incorrect input");
                return "";
            }
        }
        catch(Exception InputMismatchException){
            System.out.println("Incorrect input");
            return "";
        }
        return "";
    }

    /**
     * Display the functionality of the class in the menu.
     *
     * @return a String object
     */
    @Override
    public String menuDescription() {
        return "Add balance.";
    }
}