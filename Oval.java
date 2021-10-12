package ua.goit.HomeWork7.GraphicsEditor;

public class Oval extends Shape {
    public Oval(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println(getName());
    }
}
