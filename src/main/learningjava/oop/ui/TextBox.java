package main.learningjava.oop.ui;

public class TextBox extends UIControl {
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
}
