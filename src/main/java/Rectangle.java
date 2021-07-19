package main.java;

public class Rectangle  extends Shape {

    private final String name = "Rectangle";

    public String getName() {
        return name;
    }

    @Override
    public String result() {
        return getName();
    }
}
