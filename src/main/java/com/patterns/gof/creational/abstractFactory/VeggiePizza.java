package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class VeggiePizza extends Pizza {

    private ToppingFactory toppingFactory;

    public VeggiePizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        System.out.println(toppingFactory.createCheese());
        System.out.println(toppingFactory.createSauce());
    }
}
