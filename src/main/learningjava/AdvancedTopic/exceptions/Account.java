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

    public void withdraw(float amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException();
    }
}
