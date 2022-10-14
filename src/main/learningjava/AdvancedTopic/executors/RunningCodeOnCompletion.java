package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;

public class RunningCodeOnCompletion {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 1)
                .thenApplyAsync(RunningCodeOnCompletion::multiply)
                .thenApplyAsync(RunningCodeOnCompletion::add)
                .thenAcceptBothAsync(
                        CompletableFuture.supplyAsync(() -> 10),
                        (x, y) -> System.out.println(x + y)
                );
        future.thenRun(() -> System.out.println("Task completed"));
    }

    private static void print(Integer integer, int u) {

        System.out.println( "Testing" +  integer + u);
    }

    private static int add(Integer integer) {
        var result = integer + 2;
        System.out.println("result " + result);
        return result;
    }

    private static int multiply(Integer integer) {
        var result = integer * 2;
        System.out.println("result2 " + result);
        return result;
    }

}
