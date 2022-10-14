package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public static void sendEmail() {
        LongTask.simulate();
        System.out.println("Email sent");
    }

    public static CompletableFuture<Void> sendEmailAsync() {
        return CompletableFuture.runAsync(MailService::sendEmail);
    }
}
