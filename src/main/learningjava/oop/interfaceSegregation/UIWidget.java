package main.learningjava.oop.interfaceSegregation;

public interface UIWidget extends Draggable,  Resizable {
    //drag() overridden from Draggable
    //An interface can extend multiple interfaces or have multiple parents
    // but class clan not extend multiple classes
    //Class can implement multiple interfaces
    void drag();
    void resize();
}
