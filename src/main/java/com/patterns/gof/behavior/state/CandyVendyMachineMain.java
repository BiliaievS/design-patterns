package com.patterns.gof.behavior.state;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class CandyVendyMachineMain {
    public static void main(String[] args) {
        System.out.println("\n-----Test 1: Testing machine by inserting coin and pressing button-----");
        CandyVendingMachine machine = new CandyVendingMachine(3);
        System.out.println(machine);
        machine.insertCoin();
        System.out.println(machine);
        machine.pressButton();
        System.out.println(machine);

        System.out.println("\n-----Test 2: Testing machine by pressing button without inserting coin-----");
        machine = new CandyVendingMachine(3);
        System.out.println(machine);
        machine.pressButton();
        System.out.println(machine);

        System.out.println("\n-----Test 3: Testing machine running out of candies-----");
        machine = new CandyVendingMachine(2);
        System.out.println(machine);
        machine.insertCoin();
        System.out.println(machine);
        machine.pressButton();
        machine.insertCoin();
        System.out.println(machine);
        machine.pressButton();
        System.out.println(machine);
        machine.insertCoin();
        System.out.println(machine);
        machine.pressButton();
        System.out.println(machine);
    }
}
