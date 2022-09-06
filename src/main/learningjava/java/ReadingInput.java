package main.learningjava.java;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your num of Items:");
//        int n = scanner.nextByte();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter your Item (int): " + (i + 1));
//            nums[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(nums));
        System.out.println("Enter for float: ");
        float myFloat =  scanner.nextFloat();
        System.out.println("Float is: " + myFloat + " Enter for double: ");
        double myDouble = scanner.nextDouble();
        System.out.print("Double is: " + myDouble +  " Enter for String: ");
        String str =  scanner.nextLine();
        scanner.close();
//        String str = scanner.next();
        System.out.println("String with next is: " + str + " Enter for String2: ");
    }
}
