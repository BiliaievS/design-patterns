package com.patterns.gof.creational.abstractfactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
