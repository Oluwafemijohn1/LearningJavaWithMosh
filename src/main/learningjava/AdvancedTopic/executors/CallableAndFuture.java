package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CallableAndFuture {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
             var future = executor.submit(() -> {
                 LongTask.simulate();
                return 1;
            });
            System.out.println("Do more works...");

            try {
                var result = future.get();
                System.out.println(result);
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }

        } finally {
            executor.shutdown();
        }

    }
}
