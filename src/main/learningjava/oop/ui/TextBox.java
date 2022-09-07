package main.learningjava.oop.ui;

public class TextBox extends UIControl {
    private String text = "";

//    public TextBox(boolean isEnabled) {
//        super(isEnabled);
//    }

    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }
}
