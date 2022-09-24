package main.learningjava.AdvancedTopic.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K , V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    // class CAP#1 extends User class
    // class Instructor extends User class
    /**
     * Note: to read from the list, use extends, to add to it, use super
     */
    public static void printUsers(GenericList<? extends User> users) {
        // ? is a wildcard type which means an Unknown type allowed the function to accept User type and
        //any of its subclasses
        User first = users.get(0);
        System.out.println(first);
    }


    // to be able to add to the list we need to use super keyword, so
    // it can accept User type and any of its superclasses
    public static void printUser(GenericList<? super User> users) {
        // ? is a wildcard type which means an Unknown type allowed the function to accept User type and
        //any of its subclasses
        Object first = users.get(0);
        System.out.println(first);
    }
}
