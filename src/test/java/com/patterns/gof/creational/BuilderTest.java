package com.patterns.gof.creational;

import com.patterns.gof.creational.builder.ConstructionHouse;
import com.patterns.gof.creational.builder.House;
import com.patterns.gof.creational.builder.MyHouseBuilder;
import org.junit.jupiter.api.Test;

/**
 * @author Sergii Biliaiev
 * Created on 21/07/2019.
 */
public class BuilderTest {

    @Test
    public void testMyBuilder() {
        ConstructionHouse constructionHouse = new ConstructionHouse(new MyHouseBuilder());
        House house = constructionHouse.constructHouse();
        System.out.println("House is " + house);
    }
}
