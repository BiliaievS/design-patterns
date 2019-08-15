package com.patterns.gof.structural.flyweight;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public abstract class RaceCar {

    String name;
    int speed;
    int hoursePower;

    abstract void moveCar(int currentX, int currentY, int newX, int newY);
}
