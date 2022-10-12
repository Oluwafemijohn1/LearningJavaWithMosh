package main.learningjava.AdvancedTopic.concurrency;

public class ConcurrencyIssues {
    public static void show(){
        //most time the download thread access modified shared resources and report totalBytes downloaded
        //1st issues happens when multiple thread tries to modify the same data at the same time i.e RACE CONDITION
        //2nd issue happens when one thread changes the shared data but the changes is not visible to
        // other thread i.e VISIBILITY PROBLEM

        //To solve this we have to write code that is run concurrently without issue i.e THREAD-SAFE CODE
    }
}
