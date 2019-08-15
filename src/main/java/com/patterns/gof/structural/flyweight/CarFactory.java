package com.patterns.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public class CarFactory {

    private static Map<String, RaceCar> flyweights = new HashMap<>();

    public static RaceCar getRaceCar(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }

        RaceCar raceCar;

        switch (key) {
            case "Midget":
                raceCar = new FlyweightMidgetCar();
                raceCar.name = "Midget car";
                raceCar.speed = 160;
                raceCar.hoursePower = 110;
                break;
            case "Sprint":
                raceCar = new FlyweightSprintCar();
                raceCar.name = "Sprint car";
                raceCar.speed = 210;
                raceCar.hoursePower = 160;
                break;
            default:
                throw new IllegalArgumentException("Unsupported car type.");
        }
        flyweights.put(key, raceCar);
        return raceCar;
    }
}
