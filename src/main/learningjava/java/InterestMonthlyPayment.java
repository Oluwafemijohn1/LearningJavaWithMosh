package main.learningjava.java;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class InterestMonthlyPayment {
    static final double MINIMUM_PRINCIPAL = 1000;
    static final double MAXIMUM_PRINCIPAL = 200_000;
    static final float MAXIMUM_INTEREST_RATE = 30;
    static final float MINIMUM_INTEREST_RATE = 1;
    static final byte MINIMUM_YEARS = 1;
    static final byte MAXIMUM_YEARS = 30;
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENTAGE_IN_PERCENT = 100;
    public static void main(String[] args) {

        double principal =  readNumber( "Enter the principal: ", MINIMUM_PRINCIPAL, MAXIMUM_PRINCIPAL);
        float annualInterest = (float) readNumber("Enter the annual interest rate: ", MINIMUM_INTEREST_RATE, MAXIMUM_INTEREST_RATE);
        byte numberOfYears = (byte) readNumber("Enter the number of years: ", MINIMUM_YEARS, MAXIMUM_YEARS);

        int numberOfPayments = numberOfYears * MONTHS_IN_YEAR;
        double monthlyInterestRate = annualInterest / PERCENTAGE_IN_PERCENT / MONTHS_IN_YEAR;

        printMortgage(principal, numberOfPayments, monthlyInterestRate);
        printPaymentSchedule(principal, numberOfYears, numberOfPayments, monthlyInterestRate);
    }

    private static void printMortgage(double principal, int numberOfPayments, double monthlyInterestRate) {
        System.out.println();
        System.out.println("MORTGAGE: ");
        System.out.println("---------------");
        System.out.println(calculateMonthlyMortgagePayment(principal, monthlyInterestRate, numberOfPayments));
    }

    private static void printPaymentSchedule(double principal, byte numberOfYears, int numberOfPayments, double monthlyInterestRate) {
        System.out.println();
        System.out.println("------------------");
        System.out.println("PAYMENT SCHEDULE: ");
        for(short month = 1; month <= numberOfYears * MONTHS_IN_YEAR; month++) {
            System.out.println( calculateBalance(principal, monthlyInterestRate, numberOfPayments, month));
        }
    }

    public static double readNumber (String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print(prompt);
            try {

            number = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input"  );
                number = scanner.nextDouble();
            }
            if(number >= min  &&  number <= max)
                break;
            System.out.println("Interest rate must be between " + min + " and " + max);
        }
        return number;
    }

    public static String calculateMonthlyMortgagePayment(
            double principal,
            double monthlyInterestRate,
            int numberOfPayments) {

        double monthlyPayment = principal  *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        NumberFormat formattedCurrency = NumberFormat.getCurrencyInstance();
        formattedCurrency.setCurrency(
                Currency.getInstance(
                        Locale.US));

        return formattedCurrency.format(monthlyPayment);
    }

    public static String calculateBalance(
            double principal,
            double monthlyInterestRate,
            int numberOfPayments,
            short numberOfPaymentsMade) {


        double monthlyPayment = principal *
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        NumberFormat formattedCurrency = NumberFormat.getCurrencyInstance();
        formattedCurrency.setCurrency(Currency.getInstance(Locale.US));
//        System.out.println(formattedCurrency.format(monthlyPayment));
        return  formattedCurrency.format(monthlyPayment);
    }
}
