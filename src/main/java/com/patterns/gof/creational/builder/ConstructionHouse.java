package com.patterns.gof.creational.builder;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public class ConstructionHouse {
    private HouseBuilder builder;

    public ConstructionHouse(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        return builder
                .buildFoundation()
                .buildRoof()
                .buildStructure()
                .paintHouse()
                .furnishHouse()
                .getHouse();
    }

    public static void main(String[] args) {
        var constructionHouse = new ConstructionHouse(new MyHouseBuilder());
        var house = constructionHouse.constructHouse();
        System.out.println("House is " + house);
    }
}
