package com.code.desginpattern.SingletonPattern;

public class Singleton {

public static void main(String[] args){
  // private access specifier
//  SingleObjectEager eager = new SingleObjectEager(); // not visible
//  SingleObjectLazy lazy = new SingleObjectLazy(); // not visible
//  SingleObjectSynchronized eager = new SingleObjectSynchronized(); // not visible
//  SingleObjectSynchronizedBetter eager = new SingleObjectSynchronized(); // not visible

  //get the only object and display message
  SingleObjectEager.getInstance().showMessage();
  SingleObjectLazy.getInstance().showMessage();
  SingleObjectSynchronized.getInstance().showMessage();
  SingleObjectSynchronizedBetter.getInstance().showMessage();

}
}
