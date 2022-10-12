package main.learningjava.AdvancedTopic.concurrency;

public class DownloadStatus {
    private int totalBytes;
//    private int totalFiles;

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

//    public int getTotalFiles() {
//        return totalFiles;
//    }
//
//    public void incrementTotalFiles() {
//        totalFiles++;
//    }
}
