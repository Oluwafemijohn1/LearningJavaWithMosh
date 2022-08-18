package main;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++)
//            System.out.println("Hello World" + i);
//        for (int i = 0; i < 10; i++) {
//            if (i == 5){
//                continue;
//            }
//            if (i == 7)
//                break;
//            System.out.println("Hello World" + i);
//
//        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
//
//        while (!input.equals("quit") ) {
//            System.out.println("Enter your input:");
//            input = scanner.nextLine().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println("You entered: " + input);
//        }

//        do {
//            System.out.println("Enter your input:");
//            input = scanner.nextLine();
//            System.out.println("You entered: " + input);
//        } while (!input.equals("quit"));

        // professional practice for while loops
        while (true ) {
            System.out.println("Enter your input:");
            input = scanner.nextLine().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println("You entered: " + input);
        }

        // for loop over an array
        String [] names = {"John", "Jane", "Joe"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names)
            System.out.println(name);
    }
}
