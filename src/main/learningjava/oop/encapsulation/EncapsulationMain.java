package main.learningjava.oop.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        Employee encapsulation = new Employee(50_000, 20);
        int wage = encapsulation.calculateWage(20);
        System.out.println(wage);
        var browser = new Browser();
        browser.navigate("www.google.com");
    }
}
