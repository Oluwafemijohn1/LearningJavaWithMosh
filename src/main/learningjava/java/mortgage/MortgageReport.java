package main.learningjava.java.mortgage;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MortgageReport {
    private MortgageCalculator mortgageCalculator;

    public MortgageReport(MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("------------------");
        System.out.println("PAYMENT SCHEDULE: ");
        for(double balance : mortgageCalculator.getRemainingBalances()){
            var dollarBalance = NumberFormat.getCurrencyInstance();
            dollarBalance.setCurrency(Currency.getInstance(Locale.US));
            System.out.println(dollarBalance.format(balance));
        }
    }

    public void printMortgage() {
//        mortgageCalculator = new MortgageCalculator(principal, monthlyInterestRate, numberOfPayments);
        String mortgage = mortgageCalculator.calculateMonthlyMortgagePayment();
        System.out.println();
        System.out.println("MORTGAGE: ");
        System.out.println("---------------");
        System.out.println("Monthly Payments: " + mortgage);
    }
}
