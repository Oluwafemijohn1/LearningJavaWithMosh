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

    //Java does not support multiple inheritance.
    //because it is not possible to inherit from two classes that have the same method.
    //also it is not possible to inherit from two classes that have the same field.
    //Java does support multiple interfaces.

    //What is the super keyword?
    /**
     * The super keyword is used to call the constructor of the superclass or to call the method of the superclass.
     * */

    //What is the difference between private and protected access modifiers?
    /**
     * Private members are not inherited in subclasses.
     * Protected members are inherited in subclasses but not outside the package.
     * Public members are inherited in subclasses.
     * Default members are inherited in subclasses.
     * */

    //How accessible is a field or method if it’s declared without an access modifier?
    /**
     * If a field or method is declared without an access modifier, it is accessible within the package. i.e. it is not accessible outside the package.
     * */


    //What are the four principles of object-oriented programming?
    /**
     * Pillers of OOP concept
     * 1. Abstraction
     * 2. Encapsulation
     * 3. Inheritance
     * 4. Polymorphism
     * **/

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls) {
            control.render();
        }
    }
}
