package com.patterns.gof.behavior.observer;

import java.math.BigDecimal;

/**
 * @author Sergii Biliaiev
 * Created on 30/08/2019.
 */
public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observer observer, String productName, BigDecimal bidAmount) {
        if (observer.toString().equals(name)) {
            System.out.printf("Hello %s! New bid of amount %s has been placed on %s bu you.%n", name, bidAmount, productName);
        } else {
            System.out.printf("Hello %s! Hew bid of amount %s has been placed on %s by %s%n", name, bidAmount, productName, observer);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
