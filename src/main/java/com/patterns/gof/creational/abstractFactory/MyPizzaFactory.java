package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class MyPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        var factory = new SicilianToppingFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(factory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(factory);
                break;
            case "veggie":
                pizza = new VeggiePizza(factory);
                break;
            default:
                throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
