package main.learningjava.oop.interfaceSegregation;

public interface Resizable {
    void resize(int size);
    void resize(int width, int height);
    void resize(int x, int y, int z);
    void resize(UIWidget widget);
}
