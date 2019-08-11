package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        description = "Rose bouquet";
    }

    public double cost() {
        return 12.0;
    }
}
