package main.learningjava.oop.ui;

public class TextBox extends UIControl {
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
