package main.java;

public class Cube extends Shape {

    private final String name = "Cube";

    public String getName() {
        return name;
    }

    @Override
    public String result() {
        return getName();
    }
}
