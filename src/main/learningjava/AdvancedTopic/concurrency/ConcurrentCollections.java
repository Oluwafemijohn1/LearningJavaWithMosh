package main.learningjava.AdvancedTopic.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections {
    public static void show() {
        Map<String, String> map = new ConcurrentHashMap<>();
        map.putIfAbsent("key1", "value1");
        map.putIfAbsent("key1", "value2");
        System.out.println(map.get("key1"));
        map.remove("key1", "value1");
    }
}
