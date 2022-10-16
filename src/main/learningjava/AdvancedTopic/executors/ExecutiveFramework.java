package main.learningjava.AdvancedTopic.executors;

public class ExecutiveFramework {
    // Working with multiple Thread has some problems:
    // 1. We have limited thread available in the system and if exceeded the system will crash and then get out of
    // memory exception.
    // 2. it is costly
    public static void main(String[] args) {
//        ExecutorDemo.show();
//        CallableAndFuture.show();
//        CompletableFutureDemo.show();

        /**
         * This will block the current thread
         * */
//        MailService.sendEmail();
//        System.out.println("Hello send");

        /**
         * This will not block the current thread
         *
         * but you may not see the result printed because the program will terminate quickly after completion.
         * */
//        MailService.sendEmailAsync();
//        System.out.println("Hello send");

        /**
         * So we add a little delay
         * */
//        MailService.sendEmailAsync();
//        System.out.println("Hello send");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        /**
         * doing something when async task is completed
         * */
//        RunningCodeOnCompletion.show();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        /**
         * Handling error
         * */
//        CompletableFutureErrorHandling.show();

        /**
         * Transforming data
         * */
//        TransformingCompletableFuture.show();

        /**
         * Composing CompletableFuture
         * */
//        ComposingCompletableAsync.show();

        /**
         * Combining CompletableFuture
         * */
//        CombiningCompletableFuture.show();

        /**
         * Waiting for many task of CompletableFuture
         * */
//        WaitingForManyTaskOfCompletableFuture.show();

        /**
         * Waiting for the first task
         * */
        WaitingForTheFirstTask.show();

        /**
         * Handling time out
         * */
        HandlingTimeOut.show();
    }

}
