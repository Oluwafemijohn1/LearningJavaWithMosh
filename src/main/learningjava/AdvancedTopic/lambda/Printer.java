package main.learningjava.AdvancedTopic.lambda;

public interface Printer {
    // Functional interface has only one abstract method
    // It can have any number of default methods or static methods
    // But as long as it has only one abstract method it is a functional interface
    void print(String message);

//    default void printTwice(String message) {
//        System.out.println(message);
//        System.out.println(message);
//    }
}
