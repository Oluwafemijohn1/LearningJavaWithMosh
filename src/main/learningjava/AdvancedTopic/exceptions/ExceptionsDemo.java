package main.learningjava.AdvancedTopic.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    /**
     * This is not a good implementation of exception handling
     * */
//    public static void show(){
////        sayHello("jf");
//        FileReader reader = null;
//
//        try {
//             reader = new FileReader("file.txt");
//            reader.read();
//            new SimpleDateFormat().parse("01/01/2020");
//
//        } catch (IOException | ParseException e) {
////            System.out.println("Could not open file");
//            System.out.println(e.getMessage());
//        } finally {
//            if (reader != null){
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


    public static void show(){
//        sayHello("jf");
//        FileReader reader = null;

        /**
         * Using external resources in try catch block
         * */
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...");
        ) {
            reader.read();
            new SimpleDateFormat().parse("01/01/2020");

        } catch (IOException | ParseException e) {
//            System.out.println("Could not open file");
            System.out.println(e.getMessage());

        }
    }

    public static void sayHello(String name){
        System.out.println( name.toUpperCase());
    }

}
