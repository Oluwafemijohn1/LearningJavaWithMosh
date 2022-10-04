package main.learningjava.AdvancedTopic.lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void show(){
        UnaryOperator<Integer> quote = (a) -> a * a;
        UnaryOperator<Integer> add = (a) -> a + 1;
        var result = add.andThen(quote).apply(1);
        System.out.println("Result: " + result);
    }
}
