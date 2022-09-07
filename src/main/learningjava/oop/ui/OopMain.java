package main.learningjava.oop.ui;

import main.learningjava.oop.Point;
import main.learningjava.oop.ui.TextBox;

public class OopMain {
    // Every class in Java inherits from the Object class directly or indirectly.
    // The Object class is the root of the class hierarchy.

    // Private members are not inherited in subclasses.
    // Protected members are inherited in subclasses.
    // Public members are inherited in subclasses.
    // Default members are inherited in subclasses.

    public static void main(String[] args) {
        var textBox1 = new TextBox();
//        var control = new UIControl(true);
//        var control2 = control;
//        System.out.println(control.equals(control2));
//        show(control);
        var point = new Point(1, 2);
        var point2 = new Point(1, 2);
//        System.out.println(point.equals(control));
    }
    //Upcasting and Downcasting
    //Upcasting is when you assign a subclass to a superclass.
    // Downcasting is when you assign a superclass to a subclass.
    static void show(UIControl control) {
        //downcasting
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
