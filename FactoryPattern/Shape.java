package com.code.desginpattern.FactoryPattern;

public interface Shape {
  void draw();
  static void display(String name){
    System.out.println("Name of the Class"+ name);
  }
  default void check(Shape shape){
    if(shape instanceof Circle)
      System.out.println("Instance is of type Circle");
    else if(shape instanceof Square)
      System.out.println("Instance is of type Square");
    else if(shape instanceof Rectangle)
      System.out.println("Instance is of type Rectangle");
    else
      System.out.println("other instance");
  }
}
