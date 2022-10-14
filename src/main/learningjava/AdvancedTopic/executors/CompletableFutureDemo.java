package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        // If you ar not expecting any value from the task, use runAsync
        Runnable task = () -> System.out.println("Hello");
        CompletableFuture.runAsync(task);

        // If you are expecting a value from the task, use supplyAsync
        Supplier<Integer> task2 = () -> 1;
        var  future = CompletableFuture.supplyAsync(task2);

        try {
            future.get(); // this will block the main thread
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
