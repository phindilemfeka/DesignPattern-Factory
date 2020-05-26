package com.company;

public class Main {

    public static void main(String[] args) {

        Shape sh = ShapeFactory.getShape("CIRcle");
        assert sh != null;
        sh.drawShape();

        Shape sh1 = ShapeFactory.getShape("SqUAre");
        assert sh1 != null;
        sh1.drawShape();

        Shape sh2 = ShapeFactory.getShape("TriaNGLE");
        assert sh2 != null;
        sh2.drawShape();



    }
}
