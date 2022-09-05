package main.learningjava;

public class DebuggingJavaApp {
    public static void main(String[] args) {
        System.out.println("Start");
        printNumbers(4);
        System.out.println("End");

    }
    public static void printNumbers(int limit) {
        for (int i = 0; i < limit; i +=2) {
            System.out.println(i);
        }
    }
}
