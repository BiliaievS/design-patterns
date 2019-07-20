package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class PepperoniPizza extends Pizza {

    private ToppingFactory toppingFactory;

    public PepperoniPizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createSauce();
        toppingFactory.createCheese();
    }
}
