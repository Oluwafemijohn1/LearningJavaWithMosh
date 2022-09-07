package main.learningjava.oop.ui;

public class CheckBox extends UIControl {
    private boolean isChecked = false;

    public CheckBox() {
        super(true);
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public void render() {
//        super.render();
        System.out.println("Render CheckBox");
    }
}


