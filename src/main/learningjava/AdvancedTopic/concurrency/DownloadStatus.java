package main.learningjava.AdvancedTopic.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;


    private AtomicInteger totalBytesAtomic = new AtomicInteger();
    private LongAdder totalBytesAdder = new LongAdder();
    private  int totalFiles;
    private Lock lock = new ReentrantLock();

    private volatile boolean isDone;

    //using dedicated monitor object, the use of this as a monitor object is a bad practice because
    // two threads can not access the same object at the same time
    private final Object totalBytesLock = new Object();
    private final Object totalFilesLock = new Object();


    public void incrementTotalBytes() {
        totalBytes++;
        // This is a non-atomic operation
        // It involves 3 steps
        // 1. Read the value of totalBytes into the CPU register
        // 2. Increment the value in the register
        // 3. Write the value back to the main memory
    }

    public void incrementTotalBytesAtomic() {
        totalBytesAtomic.incrementAndGet(); // === ++totalBytesAtomic
//        totalBytesAtomic.getAndIncrement(); // === totalBytesAtomic++
    }

    public void incrementTotalBytesAdder() {
        totalBytesAdder.increment();
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
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    public void incrementTotalFiles() {
        synchronized (totalFilesLock) {
            totalFiles++;
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone() {
        isDone = true;
    }

    public int getTotalBytesAtomic() {
        return totalBytesAtomic.get();
    }

    public int getTotalBytesAdder() {
        return totalBytesAdder.intValue();
    }

}
