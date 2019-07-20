package com.patterns.gof.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

public class MyPizzaFactoryTest {

    @Test
    public void testCreatePizza() {
        MyPizzaFactory pizzaFactory = new MyPizzaFactory();
        var randomPizza = List.of("cheese", "veggie").get(new Random().nextInt(2));
        pizzaFactory.createPizza(randomPizza);
    }
}
