package com.code.desginpattern.FactoryPattern;

public class Square implements Shape {
  @Override
  public void draw(){
    System.out.println("Inside Square:draw() method");
  }

  @Override
  public void check(Shape shape) {
    Shape.super.check(shape);  // In the case of overridden default method of an interface we have to specify the specific interface which default implementation we want to invoke
    System.out.println("Instance is of type Square, but in Sqaure class");
  }
}
