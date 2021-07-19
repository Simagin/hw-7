package main.java;

public class Circle extends Shape{

    private final String name = "Circle";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String result() {
        return getName();
    }
}
