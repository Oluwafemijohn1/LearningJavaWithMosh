package main;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class InterestMonthlyPayment {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE_IN_PERCENT = 100;
        final double MINIMUM_PRINCIPAL = 1000;
        final double MAXIMUM_PRINCIPAL = 100_000;
        final double MAXIMUM_INTEREST_RATE = 30;
        Scanner scanner = new Scanner(System.in);
        double principal;
        while (true) {
            System.out.print("Enter your principal: ");
            principal = scanner.nextDouble();
            if(principal < MINIMUM_PRINCIPAL || principal > MAXIMUM_PRINCIPAL)
                System.out.println("Principal must be between " + "$" + MINIMUM_PRINCIPAL + " and " + "$" + MAXIMUM_PRINCIPAL);
            else break;
        }
        float annualInterest;
        while (true) {
            System.out.print("Enter your interest rate: ");
            annualInterest = scanner.nextFloat();
            if(annualInterest <=0  || annualInterest > MAXIMUM_INTEREST_RATE)
                System.out.println("Interest rate must be between 0 and " + MAXIMUM_INTEREST_RATE + "%");
            else break;
        }

        byte numberOfYears;
        while (true) {
            System.out.print("Enter your number of years: ");
            numberOfYears = scanner.nextByte();
            if(numberOfYears < 1 || numberOfYears > 30)
                System.out.println("Number of years must be greater than 0" + " and less than " + 30);
            else break;
        }
        int numberOfPayments = numberOfYears * MONTHS_IN_YEAR;
        scanner.close();
        double monthlyInterestRate = annualInterest / PERCENTAGE_IN_PERCENT / MONTHS_IN_YEAR;
        double monthlyPayment = principal  * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        NumberFormat formattedCurrency = NumberFormat.getCurrencyInstance();
        formattedCurrency.setCurrency(
                Currency.getInstance(
                        Locale.US));
        System.out.println("Your monthly payment is: " + formattedCurrency.format(monthlyPayment));
    }
}
