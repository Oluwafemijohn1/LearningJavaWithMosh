package main.learningjava.java.mortgage;

public class InterestMonthlyPayment {
    public static void main(String[] args) {

        double principal =  Console.readNumber( "Enter the principal: ", MortgageCalculator.MINIMUM_PRINCIPAL, MortgageCalculator.MAXIMUM_PRINCIPAL);
        float annualInterest = (float) Console.readNumber("Enter the annual interest rate: ", MortgageCalculator.MINIMUM_INTEREST_RATE, MortgageCalculator.MAXIMUM_INTEREST_RATE);
        byte years = (byte) Console.readNumber("Enter the number of years: ", MortgageCalculator.MINIMUM_YEARS, MortgageCalculator.MAXIMUM_YEARS);

        var mortgageCalculator = new MortgageCalculator(principal, annualInterest, years);
        var mortgageReport = new MortgageReport(mortgageCalculator);
         mortgageReport.printMortgage();
        mortgageReport.printPaymentSchedule();
    }

}
