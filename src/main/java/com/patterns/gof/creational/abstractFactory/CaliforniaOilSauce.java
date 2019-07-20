package com.patterns.gof.creational.abstractFactory;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce() {
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("Preparing california oil sauce.");
    }
}
