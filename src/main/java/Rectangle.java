package main.java;

public class Rectangle extends Shape {

    private final String name = "Rectangle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String result() {
        return getName();
    }
}
