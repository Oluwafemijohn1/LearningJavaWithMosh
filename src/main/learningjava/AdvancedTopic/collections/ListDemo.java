package main.learningjava.AdvancedTopic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        System.out.println(list);
        Collections.addAll(list, "d", "e", "f");
        System.out.println(list);
        list.add(0, "!");
        System.out.println(list);
        System.out.println( "index " + list.indexOf("a"));
        System.out.println( "lastIndexOf " + list.lastIndexOf("a"));
        System.out.println("SubList " + list.subList(0, 3));
        System.out.println(list);
        //set method replaces the element at the specified position in this list with the specified element.
        list.set(0, "a");
        System.out.println( "after set List " +list);
        list.remove(0);
        System.out.println( "After remove with index " + list);
        list.remove("a");
        System.out.println( "After removing with item " + list);
        list.set(0, "a");
        System.out.println( "After set List " +list);
        list.removeAll(List.of("a", "b"));
        System.out.println( "After removing all " + list);
        list.clear();
        System.out.println( "After clearing " + list.isEmpty());
    }
}
