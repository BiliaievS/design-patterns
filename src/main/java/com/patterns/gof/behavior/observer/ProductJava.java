package com.patterns.gof.behavior.observer;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Sergii Biliaiev
 * Created on 31/08/2019.
 */
public class ProductJava extends Observable {
    private String productName;
    private BigDecimal bid;
    private Observer observer;

    public String getProductName() {
        return productName;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public Observer getObserver() {
        return observer;
    }

    public ProductJava(String name, BigDecimal bid) {
        this.productName = name;
        this.bid = bid;
    }

    public void setBid(Observer observer, BigDecimal newBid) {
        System.out.println("----------New Bid placed-----------");
        int res = bid.compareTo(newBid);
        if (res == -1) {
            this.observer = observer;
            this.bid = newBid;
            setChanged();
            notifyObservers();
        } else {
            System.out.println("----------New Bid amount cannot be less or equal to current bid amount---------");
        }
    }
}
