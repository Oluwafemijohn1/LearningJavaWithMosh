package main.learningjava.AdvancedTopic.generics;

import java.util.Iterator;

//In byte code, the type parameter T is replaced with Object
public class GenericList<T> implements Iterable {
    private T[] items = (T[]) new Object[10];
    private int count;
    public void add(T item) {
        items[count++] = item;
    }
    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(this);
    }

    //This is a nested class
    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;
        public ListIterator(GenericList<T> list) {
            this.index = 0;
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            return index < list.count;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
