package main.learningjava.AdvancedTopic.concurrency;

public class JoiningThread {
    public static void show() {
        var thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 2: " + Thread.currentThread().getName());
    }
}
