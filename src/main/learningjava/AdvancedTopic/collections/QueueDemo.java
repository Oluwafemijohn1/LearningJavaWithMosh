package main.learningjava.AdvancedTopic.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<String>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        System.out.println(queue);
        queue.offer("d");
        System.out.println(queue);

        //Returns: the head of this queue
        //Throws: NoSuchElementException – if this queue is empty
        System.out.println( "element " + queue.element());
        //Returns: the head of this queue, or null if this queue is empty
        System.out.println( "peek " + queue.peek());
        //remove the first element but throws an exception if this queue is empty.
        System.out.println( "remove " +  queue.remove());
        System.out.println(queue);
//        queue.clear();
        //poll is the same as remove but it returns null if the queue is empty
        System.out.println( "poll " + queue.poll());
    }
}
