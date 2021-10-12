package ua.goit.HomeWork7.GraphicsEditor;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void name();
}