package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 31/08/2019.
 */
public interface CandyVendingMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}
