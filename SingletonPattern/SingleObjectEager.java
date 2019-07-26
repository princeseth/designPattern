package com.code.desginpattern.SingletonPattern;

public class SingleObjectEager {

  private SingleObjectEager(){}

  private static SingleObjectEager obj = new SingleObjectEager();
// Thread safe as it gets initialized as class gets loaded
  public static SingleObjectEager getInstance(){
    return obj;
  }
  public void showMessage(){
    System.out.println("In Eager object!");
  }
}
