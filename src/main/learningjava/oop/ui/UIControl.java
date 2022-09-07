package main.learningjava.oop.ui;

public abstract class UIControl {

    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }


    //this methode can not be overriden by the child class because it is final
    public final void enable() {
        this.isEnabled = true;
    }

    public void disable() {
        this.isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public abstract void render();
}
