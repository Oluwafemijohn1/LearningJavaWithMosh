import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte num = 127;
        short num2 = 32767;
        int num3 = 2_147_483_647;
        long num4 = 9_223_372_036_854_775_807L;
        float num5 = 3.14f;
        double num6 = 3.14D;
        char ch = 'a';
        boolean bool = true;
        String str = "Hello world!";
        System.out.println(num2);
        Date date = new Date();
        System.out.println(date);
        boolean dateBool =  date.after(new Date());
        /**
         * Primitive data types: byte, short, int, long, float, double, char, boolean
         * Reference data types: String, Date, Color, Point, Rectangle, Dimension, Font, Image, etc.
         * Primitive data types are stored on the stack, reference data types are stored on the heap.
         * Primitive data types are passed by value, reference data types are passed by reference.
         * Primitive data types are copied when passed, reference data types are referenced when passed.
         * Primitive data types are copied when returned, reference data types are referenced when returned.
         * Primitive data types are copied when assigned, reference data types are referenced when assigned.
         * Primitive data types are copied when passed as arguments, reference data types are referenced when passed as arguments.
         * Primitive data types are copied when returned as return value, reference data types are referenced when returned as return value.
         * Primitive data types are copied when assigned to a variable, reference data types are referenced when assigned to a variable.
         * Primitive data types are copied when assigned to an array element, reference data types are referenced when assigned to an array element.
         * Primitive date types do not have a constructor, reference data types have constructors.
         * Primitive data types have a valueOf() method, reference data types have a new() method.
         * Primitive data types do not have references to other objects, reference data types have references to other objects.
         * Primitive data types are immutable, reference data types are mutable.
         * */

        System.out.println(dateBool);
        date.getTime();
        System.out.println( "time-->" + date);
        Point point = new Point(1, 1);
        Point point2 = point;
        point.x = 2;
        System.out.println();


        // Different between parameter and argument
        // Parameter is a variable that is passed to a method as an argument.
        // Argument is the actual value that is passed to the method.
    }
}