package com.patterns.gof.creational.builder;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public class MyHouseBuilder implements HouseBuilder {
    private House house;

    public MyHouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder buildFoundation() {
        house.setFoundation("brick and stone");
        System.out.println("MyHouseBuilder: Foundation complete...");
        return this;
    }

    @Override
    public HouseBuilder buildStructure() {
        house.setStructure("mortar, brick, and reinforced steel");
        System.out.println("MyHouseBuilder: Structure complete...");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof("reinforced steel");
        System.out.println("MyHouseBuilder: Roof complete...");
        return this;
    }

    @Override
    public HouseBuilder paintHouse() {
        house.setPainted(true);
        System.out.println("MyHouseBuilder: Painting completed...");
        return this;
    }

    @Override
    public HouseBuilder furnishHouse() {
        house.setFurnished(true);
        System.out.println("MyHouseBuilder: Furnishing completed...");
        return this;
    }

    @Override
    public House getHouse() {
        return house;
    }
}
