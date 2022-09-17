package main.learningjava.java.mortgage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
       private static Scanner scanner = new Scanner(System.in);

       public static double readNumber(String prompt) {
           return scanner.nextDouble();
       }

       /**
        * Method overloading
        * */
       public static double readNumber(String prompt, double min, double max) {
        double number;
        while (true) {
            System.out.print(prompt);
            try {

            number = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                number = scanner.nextDouble();
            }
            if(number >= min  &&  number <= max)
                break;
            System.out.println("Interest rate must be between " + min + " and " + max);
        }
        return number;
    }
}
