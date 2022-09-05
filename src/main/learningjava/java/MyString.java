package main.learningjava;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public class MyString  {
    public static void main(String[] args) {
        // Strings are immutable, they cannot be changed.
        String message = "   Hello world!";
        System.out.println(message);
        System.out.println(message.replace("world", "Java"));
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.length());
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(message.length() - 1));
        System.out.println(message.substring(0, message.length() - 1));
        System.out.println(message.substring(0, message.length() - 1).toUpperCase());
        System.out.println(message.substring(0, message.length() - 1).toLowerCase());
        System.out.println(message.substring(0, message.length() - 1).length());
        System.out.println(message.substring(0, 4));
        System.out.println(message.substring(4));
        System.out.println(message.indexOf("world"));
        System.out.println("A" + message.trim());
        System.out.println(message.codePointAt(0));
        System.out.println(message.getBytes(StandardCharsets.UTF_8));
        message.chars().forEach(System.out::println);
        System.out.println(message.compareTo("Hello world!"));
        //the above compares the two strings lexicographically.
        System.out.println(message.contentEquals("Hello  world!"));
        //the above compares a string with a char sequence lexicographically.
        System.out.println(message.equals("Hello world!"));
        System.out.println(message.lastIndexOf("world"));
        System.out.println(message.matches("[a-zA-Z]+"));
        System.out.println(message.lines());
        System.out.println(message.strip());
        System.out.println("Arr" + Arrays.toString(message.toCharArray()));
        //special characters in a string are escaped with a backslash.
        String message2 = "Hello \"FEMI\"";
        System.out.println(message2);
        String message3 = "c:\\temp\\file.txt";
        System.out.println(message3);
        String message4 = "c:\ntemp\\file.txt";
        System.out.println(message4);
        String message5 = "c:\ttemp\\file.txt";
        System.out.println(message5);
        String message6 = "c:\t\btemp\\file.txt";
        System.out.println(message6);
    }
}
