package main.java;

public class Main {

    public static void main(String[] args) {
        Shape cube = new Cube();
        Shape quad = new Quad();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();


        PrintFigureShape figureOutput = new PrintFigureShape();
        System.out.println(figureOutput.printFigure(cube));
        System.out.println(figureOutput.printFigure(quad));
        System.out.println(figureOutput.printFigure(circle));
        System.out.println(figureOutput.printFigure(rectangle));
        System.out.println(figureOutput.printFigure(triangle));


    }

}

