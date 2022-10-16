package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WaitingForManyTaskOfCompletableFuture {
    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);
        CompletableFuture.allOf(first, second, third)
                .thenRun(() -> {
                    // this will run after all the task is completed
                    //the get method will not block the current thread
                    try {
                        System.out.println( first.get() + second.get() + third.get());
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("All tasks are completed");
                });
    }
}
