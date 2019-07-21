package com.patterns.gof.creational.builder;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public interface HouseBuilder {

    HouseBuilder buildFoundation();
    HouseBuilder buildStructure();
    HouseBuilder buildRoof();
    HouseBuilder paintHouse();
    HouseBuilder furnishHouse();
    House getHouse();
}
