package ua.goit.HomeWork7.GraphicsEditor;

public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println(getName());
    }
}
