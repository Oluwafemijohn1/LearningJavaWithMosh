package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WaitingForTheFirstTask {
    public static void show() {
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });
        var second = CompletableFuture.supplyAsync(() -> 2);

        CompletableFuture.anyOf(first, second)
                .thenAccept(temp -> {
                    System.out.println("The first task is completed" + temp);
                });

    }
}
