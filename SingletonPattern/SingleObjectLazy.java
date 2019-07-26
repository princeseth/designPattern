package com.code.desginpattern.SingletonPattern;

public class SingleObjectLazy {
  private static SingleObjectLazy obj;

  private SingleObjectLazy(){} // Force use of getInstance

  // Not thread safe
  public static SingleObjectLazy getInstance(){   /*Lazy Instantiation, as object only be created when get Instance is called*/
    if(obj==null)
    obj = new SingleObjectLazy();

    return obj;
  }
  public void showMessage(){
    System.out.println("In Lazy object!");
  }
}
