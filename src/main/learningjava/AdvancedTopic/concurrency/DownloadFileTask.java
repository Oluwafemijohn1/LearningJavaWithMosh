package main.learningjava.AdvancedTopic.concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());
        //Pausing thread
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
