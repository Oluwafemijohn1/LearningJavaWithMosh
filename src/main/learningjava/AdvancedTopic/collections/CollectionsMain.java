package main.learningjava.AdvancedTopic.collections;


import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMain {
    /**
     * Collections that are interfaces are Iterable, Collection, List, Set, Queue
     * Collections that are classes are ArrayList, LinkedList, HashSet, LinkedHashSet, TreeSet, PriorityQueue
     * */
    public static void main(String[] args) {
        //Iterable section
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
//        var iterator = list.iterator();
//        while (iterator.hasNext()) {
//            var current = iterator.next();
//            System.out.println(current);
//        }

//        for(var item : list) {
//            System.out.println(item);
//        }

        /**
         * Collection section
         * */
//        CollectionDemo.show();
        /**
         * List sectionx
         * */
//        ListDemo.show();

        /**
         * Sorting list section
         * */
//        var customers = new ArrayList<Customer>();
//        customers.add(new Customer("c", "fe@gmail.com"));
//        customers.add(new Customer("a", "femi1@gmail.com"));
//        customers.add(new Customer("b", "femi2@gmail.com"));
//        System.out.println(customers);
//        Collections.sort(customers);
//        System.out.println(customers);

        /**
         * Queue list section
         * */
//        QueueDemo.show();

        /**
         * Set list section
         * */
//        SetDemo.show();

            /**
            * Map list section
            * */
        MapDemo.show();
    }

}
