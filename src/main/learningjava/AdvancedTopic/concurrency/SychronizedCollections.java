package main.learningjava.AdvancedTopic.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SychronizedCollections {
    public static void show() {
//        Collection<Integer> collection = new ArrayList<>(); // not thread safe but it works
        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>()); // thread safe

        var thread1 = new Thread(() -> {
            collection.addAll(List.of(1, 2, 3));
        });
        var thread2 = new Thread(() -> {
            collection.addAll(List.of(4, 5, 6));
        });

        var thread3 = new Thread(() -> {
            collection.addAll(List.of(7, 8, 9));
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection);
    }
}
