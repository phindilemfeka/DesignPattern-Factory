package com.company;

public class Main {

    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();

        Shape sh = sf.getInstance("square");
        assert sh != null;
        sh.drawShape();




    }
}
