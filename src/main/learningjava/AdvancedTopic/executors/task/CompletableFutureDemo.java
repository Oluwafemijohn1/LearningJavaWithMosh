package main.learningjava.AdvancedTopic.executors.task;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureDemo {
    public static void show() {
        var start = LocalTime.now();
        var service = new FlightService();
       var futures = service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());
        CompletableFuture.allOf(
                futures.toArray(new CompletableFuture[0])
        ).thenRun(() -> {
            var end = LocalTime.now();
//            var duration = end.getSecond() - start.getSecond();
            var duration = Duration.between(start, end);
            System.out.println("Retrieved all quotes in " + duration.toMillis() + " ms");
        });
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
