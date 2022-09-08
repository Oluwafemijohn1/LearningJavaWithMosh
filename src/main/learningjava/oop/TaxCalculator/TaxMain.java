package main.learningjava.oop.TaxCalculator;

public class TaxMain {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2022(300_000);
        var report = new TaxReport(calculator);
        report.show();
        //the above is called poor man's dependency injection
        //Spring is one of the framework that can help with dependency injection


    }
}
