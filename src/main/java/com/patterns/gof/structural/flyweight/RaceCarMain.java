package com.patterns.gof.structural.flyweight;

/**
 * @author Sergii Biliaiev
 * Created on 15/08/2019.
 */
public class RaceCarMain {

    public static void main(String[] args) {

        RaceCarClient[] carClients = {
                new RaceCarClient("Midget"),
                new RaceCarClient("Midget"),
                new RaceCarClient("Midget"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint")
        };

        carClients[0].moveCar(22, 455);
        carClients[1].moveCar(22, 344);
        carClients[2].moveCar(21, 34);
        carClients[3].moveCar(21, 454);
        carClients[4].moveCar(245, 344);
        carClients[5].moveCar(255, 44);
        carClients[6].moveCar(551, 64);
        carClients[7].moveCar(55, 345);

        System.out.println("Midget car Instances: " + FlyweightMidgetCar.num);
        System.out.println("Sprint car Instances: " + FlyweightSprintCar.num);
    }
}
