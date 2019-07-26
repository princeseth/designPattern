package com.code.desginpattern.SingletonPattern;

public class SingleObjectSynchronizedBetter {

  private static SingleObjectSynchronizedBetter obj;

  private SingleObjectSynchronizedBetter(){}

  public static synchronized SingleObjectSynchronizedBetter getInstance(){
    if( obj ==null)
      obj = new SingleObjectSynchronizedBetter();
    return obj;
  }
  public void showMessage(){
    System.out.println("Synchronized object better!");
  }
}
