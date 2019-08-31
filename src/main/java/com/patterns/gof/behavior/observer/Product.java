package com.patterns.gof.behavior.observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergii Biliaiev
 * Created on 30/08/2019.
 */
public class Product implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private BigDecimal bidAmount;
    private Observer observer;

    public Product(String productName, BigDecimal bidAmount) {
        this.productName = productName;
        this.bidAmount = bidAmount;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("-----------" + observer + " has withdraw from bidding-----------");
    }

    @Override
    public void notifyObservers() {
        System.out.println("-----------New Bid placed-----------");
        for (Observer o : observers) {
            o.update(observer, productName, bidAmount);
        }
    }

    @Override
    public void setBidAmount(Observer observer, BigDecimal newBidAmnt) {
        int res = bidAmount.compareTo(newBidAmnt);
        if (res == -1) {
            this.observer = observer;
            this.bidAmount = newBidAmnt;
            notifyObservers();
        } else {
            System.out.println("New Bid Amount cannot be less or equal to the same bid amount: " + newBidAmnt);
        }
    }
}
