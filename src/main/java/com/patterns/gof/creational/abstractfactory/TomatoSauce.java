package com.patterns.gof.creational.abstractfactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class TomatoSauce implements Sauce {

    public TomatoSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce.");
    }
}
