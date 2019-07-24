package com.code.desginpattern.FactoryPattern;

public class FactoryPatternShape extends ShapeFactory{

  public static void main(String[] args){

    ShapeFactory shapeFactory = new ShapeFactory();

    // get CIRCLE object
    Shape circle = shapeFactory.getShape("CIRCLE");

    circle.draw(); // call draw of circle

    Shape rectangle = shapeFactory.getShape("RECTANGLE");

    rectangle.draw(); // call draw of rectangle

    Shape square = shapeFactory.getShape("SQUARE");

    square.draw(); // call draw of rectangle

    // Default method functionality
    circle.check(rectangle);
    circle.check(square);
  }

}
