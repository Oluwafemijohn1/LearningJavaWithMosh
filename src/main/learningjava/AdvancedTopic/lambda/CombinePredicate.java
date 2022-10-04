package main.learningjava.AdvancedTopic.lambda;

import java.util.function.Predicate;

public class CombinePredicate {
    public static void show(){
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");
        Predicate<String> hasLeftAndRightBrace = hasLeftBrace.and(hasRightBrace);
        System.out.println(hasLeftAndRightBrace.test("{Hello World}"));
    }
}
