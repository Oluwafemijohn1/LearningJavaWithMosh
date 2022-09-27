package main.learningjava.AdvancedTopic.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("a", "fek@ddk");
        var c2 = new Customer("b", "fek@ddk");
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        System.out.println(map.get("fek@ddk"));
    }
}
