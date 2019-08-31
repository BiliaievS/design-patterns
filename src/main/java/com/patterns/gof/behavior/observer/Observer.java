package com.patterns.gof.behavior.observer;

import java.math.BigDecimal;

/**
 * @author Sergii Biliaiev
 * Created on 30/08/2019.
 */
public interface Observer {
    void update(Observer observer, String productName, BigDecimal bidAmount);
}
