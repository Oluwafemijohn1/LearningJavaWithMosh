package main.learningjava.oop.TaxCalculator;

public class TaxMain {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(300_000);
        var report = new TaxReport();
        report.show(calculator);
        //the above is called poor man's dependency injection using constructor
        //Spring is one of the framework that can help with dependency injection

        //using setter
        //report.setCalculator(new TaxCalculator2019(300_000));


        //This is called method injection
        report.show(new TaxCalculator2019(300_000));

    }
}
