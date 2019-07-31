package com.patterns.gof.creational.singleton;

/**
 * @author Sergii Biliaiev
 * Created on 01/08/2019.
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}

    public EagerSingleton getInstance() {
        return INSTANCE;
    }
}
