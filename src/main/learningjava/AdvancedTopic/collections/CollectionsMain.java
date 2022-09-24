package main.learningjava.AdvancedTopic.collections;


import main.learningjava.AdvancedTopic.generics.GenericList;

import javax.management.openmbean.ArrayType;
import java.util.List;

public class CollectionsMain {
    /**
     * Collections that are interfaces are Iterable, Collection, List, Set, Queue
     * Collections that are classes are ArrayList, LinkedList, HashSet, LinkedHashSet, TreeSet, PriorityQueue
     * */
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        for(var item : list) {
            System.out.println(item);
        }
    }
}
