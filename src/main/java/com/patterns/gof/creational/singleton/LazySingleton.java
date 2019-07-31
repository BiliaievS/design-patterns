package com.patterns.gof.creational.singleton;

/**
 * @author Sergii Biliaiev
 * Created on 01/08/2019.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
