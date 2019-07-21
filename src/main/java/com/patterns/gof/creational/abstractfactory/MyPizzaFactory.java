package com.patterns.gof.creational.abstractfactory;

import java.util.List;
import java.util.Random;

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

    public static void main(String[] args) {
        MyPizzaFactory pizzaFactory = new MyPizzaFactory();
        var randomPizza = List.of("cheese", "veggie").get(new Random().nextInt(2));
        pizzaFactory.createPizza(randomPizza);
    }
}
