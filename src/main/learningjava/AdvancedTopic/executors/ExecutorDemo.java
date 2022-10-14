package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());

            });
        } finally {
            executor.shutdown();
        }

    }
}
