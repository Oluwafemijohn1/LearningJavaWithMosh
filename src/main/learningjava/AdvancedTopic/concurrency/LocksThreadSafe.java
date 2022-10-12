package main.learningjava.AdvancedTopic.concurrency;

import java.util.ArrayList;
import java.util.List;

public class LocksThreadSafe {
    public static void show() {
        var status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status, true));
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

        System.out.println("Status: " + status.getTotalBytes());
    }
}
