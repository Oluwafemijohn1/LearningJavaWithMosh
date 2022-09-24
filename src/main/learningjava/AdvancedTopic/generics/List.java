package main.learningjava.AdvancedTopic.generics;

public class List {
    int[] items = new int[10];
    int count;
    public void add(int item) {
        items[count++] = item;
    }
    public int get(int index) {
        return items[index];
    }
}
