package main.learningjava.oop.TaxCalculator;

public class TaxMain {
    //Difference between abstract class and interface
    //1. Abstract class can have both abstract and non-abstract methods
    //2. Abstract class can have final, non-final, static and non-static variables
    //3. Abstract class can have static and non-static methods
    //4. Abstract class can have constructor and it can have multiple constructors
    //5. Abstract class can have abstract and non-abstract methods
    //6. Abstract class can have final and non-final methods

    //1. Interface can have only abstract methods
    //2. Interface can have only static and final variables
    //3. Interface can have only static methods
    //4. Interface can't have constructor
    //5. Interface can have only abstract methods

    // Interface is used to build loosely coupled, extensible and testable applications while  abstract class
    // (partially-completed classes) are used to build reusable and extendable classes.


    //What is dependency injection?
    /**
     * Dependency injection is basically providing the objects that an object needs
     * (its dependencies) instead of having it construct them itself.
     *
     * Dependency injection is a programming technique that makes a class independent
     * of its dependencies. That enables you to replace dependencies without changing
     * the class that uses them.
     *
     * */

    // type of dependency injection
    /**
     * 1. Constructor injection
     * 2. Setter injection
     * 3. Method injection
     * */

    //What is interface segregation principle?
    /**
     * A client should never be forced to implement an interface that it doesn’t use,
     * or clients shouldn’t be forced to depend on methods they do not use.
     * */


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
