package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public class Glitter extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", glitter";
    }

    @Override
    public double cost() {
        return 4 + flowerBouquet.cost();
    }
}
