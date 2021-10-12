package ua.goit.HomeWork7.GraphicsEditor;

public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println(getName());
    }
}
