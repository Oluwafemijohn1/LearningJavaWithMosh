package main;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class InterestMonthlyPayment {
    public static void main(String[] args) {
        final double MINIMUM_PRINCIPAL = 1000;
        final double MAXIMUM_PRINCIPAL = 100_000;
        final float MAXIMUM_INTEREST_RATE = 30;
        final float MINIMUM_INTEREST_RATE = 1;
        final byte MINIMUM_YEARS = 1;
        final byte MAXIMUM_YEARS = 30;
        double principal =  readNumber( "Enter the principal: ", MINIMUM_PRINCIPAL, MAXIMUM_PRINCIPAL);

        float annualInterest = (float) readNumber("Enter the annual interest rate: ", MINIMUM_INTEREST_RATE, MAXIMUM_INTEREST_RATE);

        byte numberOfYears = (byte) readNumber("Enter the number of years: ", MINIMUM_YEARS, MAXIMUM_YEARS);

        System.out.println(calculateMonthlyMortgagePayment(principal, annualInterest, numberOfYears));
    }

    public static double readNumber (String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print(prompt);
            number = scanner.nextDouble();
            if(number >= min  &&  number <= max)
                break;
            System.out.println("Interest rate must be between " + min + " and " + max);
        }
        return number;
    }

    public static String calculateMonthlyMortgagePayment(
            double principal,
            double annualInterest,
            byte numberOfYears) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE_IN_PERCENT = 100;
        int numberOfPayments = numberOfYears * MONTHS_IN_YEAR;

        double monthlyInterestRate = annualInterest / PERCENTAGE_IN_PERCENT / MONTHS_IN_YEAR;
        double monthlyPayment = principal  * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        NumberFormat formattedCurrency = NumberFormat.getCurrencyInstance();
        formattedCurrency.setCurrency(
                Currency.getInstance(
                        Locale.US));
        return formattedCurrency.format(monthlyPayment);
    }
}
