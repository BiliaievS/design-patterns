package com.patterns.gof.behavior.template_method;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class PizzaMakerMain {
    public static void main(String[] args) {
        System.out.println("-----Making Veg Pizza-----");
        PizzaMaker pizzaMaker = new VegPizzaMaker();
        pizzaMaker.makePizza();

        System.out.println("\n-----Making Non Veg Pizza-----");
        PizzaMaker pizza = new NonVegPizzaMaker();
        pizza.makePizza();

        System.out.println("\n-----Make In-House Assorted Pizza-----");
        InHouseAssortedPizzaMaker pizzaInHouse = new InHouseAssortedPizzaMaker();
        pizzaInHouse.makePizza();
    }
}
