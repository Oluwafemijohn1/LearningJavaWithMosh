package main.learningjava.AdvancedTopic.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionMain {
    //Three types of exceptions:
    //1. Checked exceptions: exceptions that are checked by the compiler
    //2. Unchecked exceptions: exceptions that are not checked by the compiler, AKA runtime exceptions
    // e.g ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException,
    // IllegalStateException, IOException, SQLException, IndexOutOfBoundsException, NumberFormatException,
    //3. Errors: exceptions that are not recoverable e.g. OutOfMemoryError, StackOverflowError, NoClassDefFoundError
    public static void main(String[] args) {
        ExceptionsDemo.show();
        try {
            Account.deposit(-1);
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println("Logging");
            throw new RuntimeException(e);
        }

    }
}
