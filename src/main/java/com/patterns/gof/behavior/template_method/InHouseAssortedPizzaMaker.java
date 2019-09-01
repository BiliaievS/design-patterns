package com.patterns.gof.behavior.template_method;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class InHouseAssortedPizzaMaker extends PizzaMaker {

    @Override
    void prepareIngredients() {
        System.out.println("Preparing sweet corns,chicken sausage, green chillies, and onions.");
    }

    @Override
    void addToppings() {
        System.out.println("Adding cheddar cheese and  bechamel sauce along with ingredients to crust.");
    }

    @Override
    protected boolean customerWantsPackedPizza() {
        return false;
    }
}
