package com.code.desginpattern.SingletonPattern;

import java.lang.reflect.Constructor;

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

  Singleton s1 = SingleObjectEager.getInstance();
  
  //Reflection
  Class clazz = Class.forName("SingletonPattern.Singleton");
  Constructor<Singleton> ctr = clazz.getDeclaredConstructor();
  ctr.setAccessible(true);
  
  Singleton s3 = clazz.newInstance();
  print("s3",s3);

}

public static void print(String name, Singleton object) {
	System.out.println(String.format("Objects : %s, Hashcode : %d", name, object));
}
}
