package com.patterns.gof.creational.abstractmethod;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public class VeggiePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Add ingredients for veggie pizza.");
    }
}
