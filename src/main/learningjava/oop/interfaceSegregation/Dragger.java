package main.learningjava.oop.interfaceSegregation;

public class Dragger {
    public void drag(Draggable draggable) {
        draggable.drag();   // this is the only method we need from the Draggable interface
        System.out.println("Dragging done");
    }
}
