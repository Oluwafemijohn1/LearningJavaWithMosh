package main.learningjava.oop.ui;

public class UIControlMain {

    //Polymorphism
    //Polymorphism is the ability of an object to take on many forms.

    // For abstract classes, we can't create an instance of it.
    // We can only create an instance of a class that inherits from it.
    //The class that inherits from it must implement all the abstract methods or it must be declared abstract itself.

    /**
     * The above gives compilation error because TextBox is final.
     * Final classes cannot be inherited.
     * Final methods cannot be overridden.
     * Final variables cannot be reassigned.
     * Final variables must be initialized.
     * Final variables are constants.
     * Example of final variables are:
     * Math.PI
     * Math.E
     * Integer.MAX_VALUE
     * Integer.MIN_VALUE
     *
     * Example of final Class are:
     * String class
     */

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls) {
            control.render();
        }
    }
}
