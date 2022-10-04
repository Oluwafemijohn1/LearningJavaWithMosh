package main.learningjava.AdvancedTopic.lambda;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void show(){
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        System.out.println(isLongerThan5.test("Hello"));
        System.out.println(isLongerThan5.test("Hello World"));
    }
}
