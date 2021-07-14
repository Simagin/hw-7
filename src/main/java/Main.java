package main.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape cube = new Cube();
        Shape quad = new Quad();

        FigureOutput figureOutput = new FigureOutput();
        System.out.println(figureOutput.res(quad));


    }

}

