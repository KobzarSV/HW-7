package ua.goit.HomeWork7.GraphicsEditor;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.printName(new Circle("Circle"));
        printer.printName(new Square("Square"));
        printer.printName(new Rectangle("Rectangle"));
        printer.printName(new Triangle("Triangle"));
        printer.printName(new Rhombus("Rhombus"));
        printer.printName(new Oval("Oval"));
    }
}
