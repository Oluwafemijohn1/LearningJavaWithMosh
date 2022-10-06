package main.learningjava.AdvancedTopic.concurrency;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
