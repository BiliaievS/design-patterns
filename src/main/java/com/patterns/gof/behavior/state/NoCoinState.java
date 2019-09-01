package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 31/08/2019.
 */
public class NoCoinState implements CandyVendingMachineState {

    CandyVendingMachine machine;

    public NoCoinState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        machine.setState(machine.getContainsCoinState());
    }

    @Override
    public void pressButton() {
        System.out.println("No coin inserted");
    }

    @Override
    public void dispense() {
        System.out.println("No coin inserted");
    }

    @Override
    public String toString() {
        return "NoCoinState";
    }
}
