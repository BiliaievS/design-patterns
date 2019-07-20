package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class CheesePizza extends Pizza {

    private ToppingFactory toppingFactory;

    public CheesePizza(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
