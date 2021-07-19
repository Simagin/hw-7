package main.java;

public class Main {

    public static void main(String[] args) {

        PrintFigureShape printFigureShape = new PrintFigureShape();
        printFigureShape.printFigure(new Cube());
        printFigureShape.printFigure(new Quad());
        printFigureShape.printFigure(new Circle());
        printFigureShape.printFigure(new Rectangle());
        printFigureShape.printFigure(new Triangle());


    }

}

