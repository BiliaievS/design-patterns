package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class ContainsCoinState implements CandyVendingMachineState {

    private final CandyVendingMachine machine;

    public ContainsCoinState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void pressButton() {
        machine.setState(machine.getDispensedState());
    }

    @Override
    public void dispense() {
        System.out.println("Press button to dispense");
    }

    @Override
    public String toString() {
        return "ContainsCoinState";
    }
}
