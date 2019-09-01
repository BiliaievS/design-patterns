package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class DispensedState implements CandyVendingMachineState {

    private final CandyVendingMachine machine;

    public DispensedState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Error. System is currently dispensing.");
    }

    @Override
    public void pressButton() {
        System.out.println("Error. System is currently dispensing");
    }

    @Override
    public void dispense() {
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
            machine.setCount(machine.getCount() - 1);
        } else {
            System.out.println("No candy available.");
            machine.setState(machine.getNoCandyState());
        }
    }

    @Override
    public String toString() {
        return "DispensedState";
    }
}
