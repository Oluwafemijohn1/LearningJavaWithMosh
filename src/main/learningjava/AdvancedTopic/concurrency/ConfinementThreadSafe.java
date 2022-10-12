package main.learningjava.AdvancedTopic.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ConfinementThreadSafe {
    public static void show() {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for(var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        tasks.stream().map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        var totalByte =   tasks.stream().map(t -> t.getStatus().getTotalBytes())
                .reduce(0, Integer::sum);
        System.out.println(totalByte);
    }
}
