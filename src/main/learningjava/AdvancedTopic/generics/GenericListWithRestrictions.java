package main.learningjava.AdvancedTopic.generics;

//Bounded Type Parameters are used to restrict the types of a generic
// type parameter to a specific type or a subtype of that type.
/**
 * This class implement a bounded type parameter
 * */

//If there are multiple restriction on the type parameter,
// Then the class implement type erasure in byte code level as it take the
// left most type to replace the T type in byte code
public class GenericListWithRestrictions <T extends Comparable<T> & Cloneable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }
    public T get(int index) {
        return items[index];
    }
}
