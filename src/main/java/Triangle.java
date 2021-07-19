package main.java;

public class Triangle extends Shape {

    private final String name = "Triangle";

    public String getName() {
        return name;
    }

    @Override
    public String result() {
        return getName();
    }
}
