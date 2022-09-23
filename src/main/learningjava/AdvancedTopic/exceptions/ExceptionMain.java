package main.learningjava.AdvancedTopic.exceptions;

import java.io.IOException;

public class ExceptionMain {
    //Three types of exceptions:
    //1. Checked exceptions: exceptions that are checked by the compiler or anticipated by the programmer
    //2. Unchecked exceptions: exceptions that are not checked by the compiler, AKA runtime exceptions
    // e.g ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException,
    // IllegalStateException, IOException, SQLException, IndexOutOfBoundsException, NumberFormatException,
    //3. Errors: exceptions that are not recoverable e.g. OutOfMemoryError, StackOverflowError, NoClassDefFoundError
    public static void main(String[] args) {
        // To be learnt latter is Logging
        try {
            ExceptionsDemo.show();
        } catch (IOException e) {
            System.out.println("An unexpected error occurred!");
        }

        try {
            Account.deposit(-1);
        } catch ( Throwable e) {
//            e.printStackTrace();
            System.out.println("Logging");
        }

        Account account = new Account();

        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
