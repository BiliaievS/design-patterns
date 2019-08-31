package com.patterns.gof.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Sergii Biliaiev
 * Created on 31/08/2019.
 */
public class BidderJava implements Observer {

    private ProductJava observable;
    private String bidderName;

    public BidderJava(String bidderName) {
        this.bidderName = bidderName;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.observable = (ProductJava) o;
        String name = this.observable.getObserver().toString();
        if (name.equals(bidderName)) {
            System.out.println("Hello " + bidderName + "! New bid of amount " + observable.getBid() + " has been placed on "
                    + observable.getProductName() + " by you");
        } else {
            System.out.println("Hello " + bidderName + "! New bid of amount " + this.observable.getBid() + " has been placed on "
                    + this.observable.getProductName() + " by " + this.observable.getObserver());
        }
    }

    @Override
    public String toString() {
        return bidderName;
    }
}
