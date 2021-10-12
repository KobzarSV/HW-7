package ua.goit.HomeWork7.GraphicsEditor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle");
        Square square = new Square("Square");
        Rectangle rectangle = new Rectangle("Rectangle");
        Triangle triangle = new Triangle("Triangle");
        Rhombus rhombus = new Rhombus("Rhombus");
        Oval oval = new Oval("Oval");

        ArrayList<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(square);
        list.add(rectangle);
        list.add(triangle);
        list.add(rhombus);
        list.add(oval);
        for (Shape shape : list) {
            shape.name();
        }

    }
}

