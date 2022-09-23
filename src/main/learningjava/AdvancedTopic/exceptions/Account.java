package main.learningjava.AdvancedTopic.exceptions;

import java.io.IOException;

public class Account {
    private int balance;
    public static void deposit(int amount) throws IOException {
//        if (amount <= 0)
//            throw new IllegalArgumentException();

        if (amount <= 0)
            throw new IOException();
    }

    public void withdraw(float amount) throws AccountException {
        if (amount > balance){
//            var insufficientFundsException = new InsufficientFundsException();
//            var accountException = new AccountException();
//            accountException.initCause(insufficientFundsException);
//            throw accountException;

            /**
             * A more better way to do this is to use the constructor of the AccountException class.
             * THIS IS CALLED CHAINING EXCEPTIONS
             * */
            throw new AccountException(new InsufficientFundsException());
        }
    }
}
