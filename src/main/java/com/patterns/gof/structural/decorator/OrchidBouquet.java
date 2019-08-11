package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        description = "Orchid bouquet";
    }

    public double cost() {
        return 29.0;
    }
}
