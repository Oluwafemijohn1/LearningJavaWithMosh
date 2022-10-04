package main.learningjava.AdvancedTopic.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("a", "fek@ddk");
        var c2 = new Customer("b", "fek@ddkdd");
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        System.out.println(map);
        System.out.println(map.get("fek@ddk"));
        var unknown = new Customer("Unknown", "");
        System.out.println( "getOrDefault" +  map.getOrDefault("fek@ddk", unknown));
        var exist = map.containsKey("fek@ddk");
        System.out.println( "Contains key" + exist);
        map.replace("fek@ddk", new Customer("c", "fek@ddk"));
        System.out.println(map);

        //Looping through Map
        for(var key : map.keySet())
            System.out.println("Keys " + key);

        for(var value : map.values())
            System.out.println("Values " + value);
        for (var entry : map.entrySet())
            System.out.println(entry);

    }
}
