package main.learningjava.AdvancedTopic.exceptions;

//Checked
//Unchecked
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
