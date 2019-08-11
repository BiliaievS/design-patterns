package com.patterns.gof.structural.decorator;

/**
 * @author Sergii Biliaiev
 * Created on 11/08/2019.
 */
public class FlowerBouguetMain {

    public static void main(String[] args) {
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() + " $" + roseBouquet.cost());

        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBlow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() + " $" + decoratedRoseBouquet.cost());

        FlowerBouquet orchidBouquet = new OrchidBouquet();
        orchidBouquet = new RibbonBlow(orchidBouquet);
        orchidBouquet = new PaperWrapper(orchidBouquet);
        System.out.println(orchidBouquet.getDescription() + " $" + orchidBouquet.cost());
    }
}
