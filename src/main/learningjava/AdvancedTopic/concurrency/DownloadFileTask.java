package main.learningjava.AdvancedTopic.concurrency;

public class DownloadFileTask implements Runnable {

    private final DownloadStatus status;
    private boolean isLocked = false;
    private boolean isSynchronized = false;
    private boolean isWait = false;
    private boolean isAtomic = false;
    private boolean isAdder = false;

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

    public DownloadFileTask(DownloadStatus status, boolean isLocked, boolean isSynchronized, boolean isWait) {
        this.status = status;
        this.isLocked = isLocked;
        this.isSynchronized = isSynchronized;
        this.isWait = isWait;
    }

    public DownloadFileTask(DownloadStatus status, boolean isLocked, boolean isSychronized, boolean isWait, boolean isAtomic) {
        this.status = status;
        this.isLocked = isLocked;
        this.isSynchronized = isSychronized;
        this.isWait = isWait;
        this.isAtomic = isAtomic;
    }

    public DownloadFileTask(DownloadStatus status, boolean isLocked, boolean isSychronized, boolean isWait, boolean isAtomic, boolean isAdder) {
        this.status = status;
        this.isLocked = isLocked;
        this.isSynchronized = isSychronized;
        this.isWait = isWait;
        this.isAtomic = isAtomic;
        this.isAdder = isAdder;
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
          if(status != null && isLocked)
              status.incrementTotalBytesLock();
          else if(status != null && isSynchronized)
                status.incrementTotalBytesSync();
          else if( status != null && isAtomic)
              status.incrementTotalBytesAtomic();
            else if( status != null && isAdder)
                status.incrementTotalBytesAdder();
          else if(status != null)
              status.incrementTotalBytes();
          else
              System.out.println("Downloading byte: " + i);

      }

        assert status != null;
        status.setDone();
           if(isWait) {
                synchronized (status) {
                    status.notify();
                }
            }
        System.out.println("Download complete: " + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }

}
