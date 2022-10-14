package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;

public class CombiningCompletableFuture {
    public static void show() {
        var first = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(str -> Integer.parseInt(str.replace("USD", "")));
        var second = CompletableFuture.supplyAsync(() -> 0.9);
                first.thenCombine(second, (price, rate) -> price * rate)
                .thenAccept(System.out::println);
    }
}
