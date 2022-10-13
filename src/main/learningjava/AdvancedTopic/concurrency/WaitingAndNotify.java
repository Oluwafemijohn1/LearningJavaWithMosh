package main.learningjava.AdvancedTopic.concurrency;

public class WaitingAndNotify {
    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status, false, false, true));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {

                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Status: " + status.getTotalBytes());
        });
        thread1.start();
        thread2.start();


    }
}
