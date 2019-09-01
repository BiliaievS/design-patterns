package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class NoCandyState implements CandyVendingMachineState {

    private final CandyVendingMachine machine;

    public NoCandyState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No candy available");
    }

    @Override
    public void pressButton() {
        System.out.println("No candy available");
    }

    @Override
    public void dispense() {
        System.out.println("No candy available");
    }

    @Override
    public String toString() {
        return "NoCandyState";
    }
}
