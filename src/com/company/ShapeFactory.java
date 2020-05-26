package com.company;

public class ShapeFactory {
    static Shape getShape(String shapeType){

        if (shapeType.equalsIgnoreCase("Circle"))
            return new Circle();

        if (shapeType.equalsIgnoreCase("Square"))
            return new Square();

        if (shapeType.equalsIgnoreCase("triangle"))
            return new Triangle();

        return null;
    }

}
