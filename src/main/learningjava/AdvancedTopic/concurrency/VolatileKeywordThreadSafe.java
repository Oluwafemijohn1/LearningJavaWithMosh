package main.learningjava.AdvancedTopic.concurrency;



public class VolatileKeywordThreadSafe {
    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while (!status.isDone()) {
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
        });

        thread1.start();
        thread2.start();


        System.out.println("Status: " + status.getTotalBytes());
    }
}
