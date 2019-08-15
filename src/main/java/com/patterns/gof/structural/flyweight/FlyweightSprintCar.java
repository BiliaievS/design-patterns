package com.patterns.gof.structural.flyweight;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public class FlyweightSprintCar extends RaceCar {

    public static int num;

    public FlyweightSprintCar() {
        num++;
    }

    @Override
    void moveCar(int currentX, int currentY, int newX, int newY) {
        System.out.println("New location of " + this.name + " is X[" + newX + "] - Y[" + newY + "]");
    }
}
