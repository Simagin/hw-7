package main.java;

public class Quad extends Shape {

    private final String name = "Quad";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String result() {
        return getName();
    }
}
