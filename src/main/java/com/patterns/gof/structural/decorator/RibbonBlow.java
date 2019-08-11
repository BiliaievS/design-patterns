package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public class RibbonBlow extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public RibbonBlow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", ribbon blow";
    }

    @Override
    public double cost() {
        return 1 + flowerBouquet.cost();
    }
}
