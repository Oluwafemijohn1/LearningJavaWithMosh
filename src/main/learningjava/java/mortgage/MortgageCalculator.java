package main.learningjava.java.mortgage;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MortgageCalculator {
    public static final double MINIMUM_PRINCIPAL = 1000;
    public static final double MAXIMUM_PRINCIPAL = 200_000;
    public static final float MAXIMUM_INTEREST_RATE = 30;
    public static final float MINIMUM_INTEREST_RATE = 1;
    public static final byte MINIMUM_YEARS = 1;
    public static final byte MAXIMUM_YEARS = 30;
    private static final byte PERCENTAGE_IN_PERCENT = 100;
    private static final byte MONTHS_IN_YEAR = 12;

    private double principal;
    private double annualInterestRate;
    private int years;

    public MortgageCalculator(double principal, double annualInterestRate, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }



    public  String calculateMonthlyMortgagePayment() {

        int numberOfPayments = getNumberOfPayments();
        double monthlyInterestRate = getMonthlyInterestRate();

        double monthlyPayment = principal  *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        NumberFormat formattedCurrency = NumberFormat.getCurrencyInstance();
        formattedCurrency.setCurrency(
                Currency.getInstance(
                        Locale.US));

        return formattedCurrency.format(monthlyPayment);
    }

    public  double calculateBalance(
            short numberOfPaymentsMade) {
        int numberOfPayments = getNumberOfPayments();
        double monthlyInterestRate = getMonthlyInterestRate();

        double monthlyPayment = principal *
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return monthlyPayment;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = calculateBalance(month);

        return balances;
    }

    private double getMonthlyInterestRate() {
        return annualInterestRate / PERCENTAGE_IN_PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private int getYear() {
        return years;
    }
}
