package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public abstract class ToppingFactory {
    public abstract Cheese createCheese();

    public abstract Sauce createSauce();
}
