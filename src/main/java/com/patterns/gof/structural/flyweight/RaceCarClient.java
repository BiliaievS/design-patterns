package com.patterns.gof.structural.flyweight;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public class RaceCarClient {

    private RaceCar car;
    private int currentX = 0;
    private int currentY = 0;

    public RaceCarClient(String key) {
        car = CarFactory.getRaceCar(key);
    }

    public void moveCar(int newX, int newY) {
        car.moveCar(currentX, currentY, newX, newY);
        currentX = newX;
        currentY = newY;
    }
}
