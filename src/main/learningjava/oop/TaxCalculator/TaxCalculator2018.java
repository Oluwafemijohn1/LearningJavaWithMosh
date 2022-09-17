package main.learningjava.oop.TaxCalculator;

public class TaxCalculator2018 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
//        getTaxableIncome(1000, 200);
        return taxableIncome * 0.1;
    }

}
