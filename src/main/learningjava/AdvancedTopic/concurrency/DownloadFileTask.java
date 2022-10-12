package main.learningjava.AdvancedTopic.concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask() {
    }
    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }



    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread().getName());
        //Pausing thread
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Download complete: " + Thread.currentThread().getName());

        //Simulating downloading a file
      for(int i = 0; i < 10_000; i++) {
          if (Thread.currentThread().isInterrupted()) return;
          if(status != null )
              status.incrementTotalBytes();
          else
              System.out.println("Downloading byte: " + i);
      }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }
}
