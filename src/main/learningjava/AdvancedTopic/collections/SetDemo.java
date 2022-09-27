package main.learningjava.AdvancedTopic.collections;

import java.lang.reflect.Array;
import java.util.*;

public class SetDemo {
    public static void show(){
        //Set is a collection that does not allow duplicates, but it does not maintain order
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        //To remove duplicate from a list
        var list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c", "c");
        var noDuplicates = new HashSet<>(list);
        System.out.println(noDuplicates);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        /**
         * union
         * */
//        set1.addAll(set2);
//        System.out.println( "union" + set1);

        /**
         * intersection
         * */
//        set1.retainAll(set2);
//        System.out.println("intersection" + set1);

        /**
         * difference
         * */
//        set1.removeAll(set2);
        System.out.println("difference" + set1);

        /**
         * symmetric difference (A∪B)−(A∩B)
         * */

    }

}
