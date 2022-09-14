package main.learningjava.oop.TaxCalculator;

public interface TaxCalculator  {
    double calculateTax();
    int minimumTax = 100;
    // this is a bad implementation in java because why should we have a field in an interface?

//    static double getTaxableIncome(double income, double expenses) {
//        return income - expenses;
//    }
    //this is another bad design in Java because why should we have a method implementation in an interface?
    // this could be done inside an abstract class

}
