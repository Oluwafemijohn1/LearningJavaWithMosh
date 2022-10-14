package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureErrorHandling {
    public static void show(){
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting weather forecast");
            throw new IllegalStateException();
        });

//        future.exceptionally(throwable -> {
//            System.out.println("Exception: " + throwable.getStackTrace());
//            return null;
//        });

        try {
            future.exceptionally(ex -> 2).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}
