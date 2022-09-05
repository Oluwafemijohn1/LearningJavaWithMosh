package main.learningjava;

public class LearningMethod {
    public static void main(String[] args) {
        hello("Femi");
    }
    // Static method can be called without creating an object
    // Static method is a method that is called without creating an object i.e without creating an instance of the class
    // It belongs to the class itself and not the object of the class
    public static void hello(String name) {
        System.out.println("Hello World" + name);
    }


}
