package main.learningjava;

import java.text.NumberFormat;

public class MathematicalOperation {
    public static void main(String[] args) {
        // this one that takes in float returns int
        int round =  Math.round(1.5f);
        // this one that takes in float returns long
        int rounds = (int)Math.round(1.45);
        System.out.println( "round" + round);
        System.out.println("rounds" + rounds);

        //ceiling is the smallest integer greater than or equal to the argument
        int ceil = (int) Math.ceil(1.5f);
        System.out.println("ceiling"+ ceil);
        //floor is the largest integer less than or equal to the argument
        int floor = (int) Math.floor(1.5f);
        System.out.println("floor " + floor);

        // max and min
        int max = Math.max(1, 2);
        System.out.println("max " + max);

        int min = Math.min(1, 2);
        System.out.println("min " + min);


        // Random number generator
        double random = Math.random();
        System.out.println("random " + random);
        System.out.println("random2 " + Math.round(random * 100));

        //Formatting currency date time etc
         // this is an abstract class and can not be instantiated with new keyword
        // so we need to use getInstance method to get an instance of the class. This is called factory method. Factory method is a method that creates an object of a class.
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         System.out.println("currency " + currency.format(10002457000.00));
         System.out.println("percent " + NumberFormat.getPercentInstance().format(0.1));

    }
}
