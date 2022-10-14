package main.learningjava.AdvancedTopic.executors;

import java.util.concurrent.CompletableFuture;

public class ComposingCompletableAsync {
    public static void show() {
         getEmailAsync()
        .thenCompose(ComposingCompletableAsync::getPlaylistAsync)
                .thenAccept(System.out::println);
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> email + "Playlists");
    }

    public static CompletableFuture<String> getEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }
}
