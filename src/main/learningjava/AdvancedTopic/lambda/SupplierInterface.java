package main.learningjava.AdvancedTopic.lambda;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void show(){
        Supplier<Double> random = () -> Math.random();
        // This is what is called lazy evaluation i.e the value is not evaluated until it is needed
        var result = random.get();
        System.out.println(result);

    }
}
