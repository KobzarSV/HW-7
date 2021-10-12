package ua.goit.HomeWork7.GraphicsEditor;

public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println(getName());
    }
}
