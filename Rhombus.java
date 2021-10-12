package ua.goit.HomeWork7.GraphicsEditor;

public class Rhombus extends Shape {
    public Rhombus(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println(getName());
    }
}
