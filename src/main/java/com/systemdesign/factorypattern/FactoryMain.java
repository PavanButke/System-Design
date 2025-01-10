package com.systemdesign.factorypattern;

public class FactoryMain {

    public  static void main(String ...args)
    {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("Circle");
        shapeObj.draw();
    }
}
