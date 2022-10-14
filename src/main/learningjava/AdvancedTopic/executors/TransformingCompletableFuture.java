package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TransformingCompletableFuture {
    public static void show() {
            var future = CompletableFuture.supplyAsync(() -> 20);
        try {
            future.thenApply(TransformingCompletableFuture::toFahrenheit)
                    .get();
            System.out.println(future);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    //No need for try catch block
    public static void show2() {
          CompletableFuture.supplyAsync(() -> 20)
                .thenApply(TransformingCompletableFuture::toFahrenheit)
                .thenAccept(System.out::println);
    }

     public static int toFahrenheit(int celsius) {
         return (int) (celsius * 1.8) + 32;
     }
}
