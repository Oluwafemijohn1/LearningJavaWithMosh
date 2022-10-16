package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HandlingTimeOut {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            //Ordinary timeout
//            var completableFuture = future.orTimeout(1, TimeUnit.SECONDS).get();

            //Timeout with default value
            var completableFuture = future.completeOnTimeout(15,1, TimeUnit.SECONDS).get();

            System.out.println("completableFuture " +completableFuture);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
