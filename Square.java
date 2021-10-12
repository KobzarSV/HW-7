package ua.goit.HomeWork7.GraphicsEditor;

public class Square extends Shape {

    public Square(String name) {
        super(name);
    }

    @Override
    public void name() {
        System.out.println(getName());
    }
}
