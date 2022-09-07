package main.learningjava.oop.ui;

import java.util.Objects;

public final class TextBox extends UIControl {
    //PolyMorphism
    //Polymorphism is the ability of an object to take on many forms.
    private String text = "";

    public TextBox() {
        super(true);
    }

    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }

    @Override
    public void render() {
//        super.render();
        System.out.println("Render TextBox");
    }
}


//class MyTextBox extends TextBox {
//    public void render() {
//        System.out.println("Render MyTextBox");
//    }
//}

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
