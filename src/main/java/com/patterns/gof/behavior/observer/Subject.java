package com.patterns.gof.behavior.observer;

import java.math.BigDecimal;

/**
 * @author Sergii Biliaiev
 * Created on 28/08/2019.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setBidAmount(Observer observer, BigDecimal newBidAmnt);

}
