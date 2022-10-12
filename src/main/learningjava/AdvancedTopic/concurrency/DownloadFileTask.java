package main.learningjava.AdvancedTopic.concurrency;

public class DownloadFileTask implements Runnable {

    private final DownloadStatus status;
    private boolean isLocked = false;

    private boolean isSynchronized = false;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }
    public DownloadFileTask(DownloadStatus status, boolean isLocked) {
        this.status = status;
        this.isLocked = isLocked;
    }

    public DownloadFileTask(DownloadStatus status, boolean isLocked, boolean isSynchronized) {
        this.status = status;
        this.isLocked = isLocked;
        this.isSynchronized = isSynchronized;
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
      for(int i = 0; i < 10_000_000; i++) {
          if (Thread.currentThread().isInterrupted()) return;
          if(status != null && isLocked)
              status.incrementTotalBytesLock();
          else if(status != null && isSynchronized)
                status.incrementTotalBytesSync();
          else if(status != null)
              status.incrementTotalBytes();
          else
              System.out.println("Downloading byte: " + i);

      }

        assert status != null;
        status.setDone();
       try{
           status.notify();
       } catch (Exception e) {
           e.printStackTrace();
       }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }

}
