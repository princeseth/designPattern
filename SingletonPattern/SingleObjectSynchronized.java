package com.code.desginpattern.SingletonPattern;

public class SingleObjectSynchronized {
  private static SingleObjectSynchronized obj;
  private SingleObjectSynchronized(){}

  // Thread safe & lazy instantiation, but imapct the performance of application
  public static synchronized SingleObjectSynchronized getInstance(){
    if(obj==null)
      obj = new SingleObjectSynchronized();

    return obj;
  }
  public void showMessage(){
    System.out.println("Synchronized object!");
  }

}
