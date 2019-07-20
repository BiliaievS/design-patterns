package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class GoatCheese implements Cheese {

    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goat cheese.");
    }
}
