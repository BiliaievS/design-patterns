package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public class PaperWrapper extends FlowerBouquetDecorator {

    private FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrapper";
    }

    @Override
    public double cost() {
        return 2 + flowerBouquet.cost();
    }
}
