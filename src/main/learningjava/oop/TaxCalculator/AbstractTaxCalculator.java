package main.learningjava.oop.TaxCalculator;

public abstract class AbstractTaxCalculator implements  TaxCalculator {
     double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}

