package main.learningjava.AdvancedTopic.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void show() {
         Collection<String> collections = new ArrayList<String>();
        Collections.addAll(collections, "a", "b", "c");
//        collections.addAll(List.of("a", "b", "c"));
        collections.add("c");
         for(var item : collections) {
             System.out.println(item);
         }
            System.out.println(collections.size());
            System.out.println(collections.isEmpty());
            System.out.println(collections.contains("a"));
            System.out.println(collections.remove("a"));
            System.out.println(collections.remove("c"));
            collections.clear();
            System.out.println(collections.isEmpty());
            var strArr = collections.toArray(new String[0]);
            System.out.println(strArr.length);
            Collection<String> others = new ArrayList<String>();
            others.addAll(collections);
        System.out.println(collections == others);
        System.out.println(collections.equals(others));
    }
}
