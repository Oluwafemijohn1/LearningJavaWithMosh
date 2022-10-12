package main.learningjava.AdvancedTopic.concurrency;

public class InterruptingThread {
    public static void  show() {
        var thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //The interrupt method does not stop the thread, it just sent a signal to the thread, so
        // to support this we need to check the interrupted status of the thread
        thread.interrupt();
    }
}
