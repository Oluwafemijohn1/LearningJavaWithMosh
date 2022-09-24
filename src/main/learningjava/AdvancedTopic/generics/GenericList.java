package main.learningjava.AdvancedTopic.generics;

//In byte code, the type parameter T is replaced with Object
public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item) {
        items[count++] = item;
    }
    public T get(int index) {
        return items[index];
    }
}
