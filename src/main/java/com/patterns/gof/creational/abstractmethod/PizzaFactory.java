package com.patterns.gof.creational.abstractmethod;

import java.util.List;
import java.util.Random;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }

    public static void main(String[] args) {
        var type = List.of("cheese", "pepperoni", "veggie").get(new Random().nextInt(3));
        new PizzaFactory().createPizza(type);
    }
}
