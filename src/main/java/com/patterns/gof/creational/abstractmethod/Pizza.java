package com.patterns.gof.creational.abstractmethod;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public abstract class Pizza {
    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }
}
