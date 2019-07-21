package com.patterns.gof.creational.abstractmethod;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public class PepperoniPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Add ingredients for pepperoni pizza.");
    }
}
