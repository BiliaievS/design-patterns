package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class CandyVendingMachine {

    private CandyVendingMachineState noCoinState;
    private CandyVendingMachineState noCandyState;
    private CandyVendingMachineState dispensedState;
    private CandyVendingMachineState containsCoinState;
    private CandyVendingMachineState state;
    private int count;

    public CandyVendingMachine(int numberOfCandies) {
        this.count = numberOfCandies;
        noCoinState = new NoCoinState(this);
        noCandyState = new NoCandyState(this);
        containsCoinState = new ContainsCoinState(this);
        dispensedState = new DispensedState(this);
        state = noCoinState;
    }

    public void refillCandy(int count) {
        this.count += count;
        this.state = noCoinState;
    }

    public void ejectCandy() {
        if (count != 0) {
            count--;
        }
    }

    public void insertCoin() {
        System.out.println("You inserted a coin.");
        state.insertCoin();
    }

    public void pressButton() {
        System.out.println("You have pressed the button.");
        state.pressButton();
        state.dispense();
    }

    public CandyVendingMachineState getNoCandyState() {
        return noCandyState;
    }

    public void setNoCoinState(NoCandyState state) {
        noCandyState = state;
    }

    public CandyVendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(CandyVendingMachineState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public CandyVendingMachineState getDispensedState() {
        return dispensedState;
    }

    public void setDispensedState(CandyVendingMachineState dispensedState) {
        this.dispensedState = dispensedState;
    }

    public CandyVendingMachineState getContainsCoinState() {
        return containsCoinState;
    }

    public void setContainsCoinState(CandyVendingMachineState containsCoinState) {
        this.containsCoinState = containsCoinState;
    }

    public CandyVendingMachineState getState() {
        return state;
    }

    public void setState(CandyVendingMachineState state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Current state of Machine [" + state + "], candies available " + count;
    }
}
