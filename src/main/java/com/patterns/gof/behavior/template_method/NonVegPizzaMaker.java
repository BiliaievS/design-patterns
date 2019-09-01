package com.patterns.gof.behavior.template_method;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class NonVegPizzaMaker extends PizzaMaker {
    @Override
    void prepareIngredients() {
        System.out.println("Preparing chicken ham, onion, chicken sausages, and smoked chicken");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding cheese, pepper jelly, and BBQ sauce along with ingredients to crust.");
    }
}
