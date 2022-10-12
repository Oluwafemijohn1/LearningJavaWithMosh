package main.learningjava.AdvancedTopic.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();
    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
        // This is a non-atomic operation
        // It involves 3 steps
        // 1. Read the value of totalBytes into the CPU register
        // 2. Increment the value in the register
        // 3. Write the value back to the main memory
    }

    public void incrementTotalBytesLock() {
        lock.lock();
        try {
            totalBytes++;
        } finally {
            lock.unlock();
        }
    }

    public  void incrementTotalBytesSync() {
        synchronized (this) {
            totalBytes++;
        }
    }

//    public int getTotalFiles() {
//        return totalFiles;
//    }
//
//    public void incrementTotalFiles() {
//        totalFiles++;
//    }
}
