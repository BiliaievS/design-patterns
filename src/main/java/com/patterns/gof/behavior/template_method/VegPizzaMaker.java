package com.patterns.gof.behavior.template_method;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class VegPizzaMaker extends PizzaMaker {
    @Override
    void prepareIngredients() {
        System.out.println("Preparing mushroom, tomato slices, onions, and fresh basil leaves.");
    }

    @Override
    void addToppings() {
        System.out.println("Adding mozzarella cheese and tomato sauce along with ingredients to crust.");
    }
}
