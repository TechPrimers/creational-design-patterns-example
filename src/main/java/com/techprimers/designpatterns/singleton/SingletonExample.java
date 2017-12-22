package com.techprimers.designpatterns.singleton;

public class SingletonExample {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton secondInstance = Singleton.getInstance();
        System.out.println(secondInstance);

        /*
        Examples of Singleton in general usage:

        1. Runtime.getRuntime()
        2. Spring Beans
        3. Logger
         */

    }
}
