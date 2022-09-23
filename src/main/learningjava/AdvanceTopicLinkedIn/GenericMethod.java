package main.learningjava.AdvanceTopicLinkedIn;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static <T> List<T> printArray(T[] inputArray) {
        List<T> list = new ArrayList<>();
        for (T element : inputArray) {
            list.add(element);
            System.out.printf("%s ", element);
        }
        System.out.println();
        return list;
    }
}
