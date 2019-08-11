package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public abstract class FlowerBouquet {

    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
