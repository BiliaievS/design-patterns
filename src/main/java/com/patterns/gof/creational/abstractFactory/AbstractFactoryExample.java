package com.patterns.gof.creational.abstractFactory;

import java.util.List;
import java.util.Random;

/**
 * @author Sergii Biliaiev
 * Created on 20/07/2019.
 */
interface Button {
    void paint();
}

class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}

class OSXButton implements Button {
    @Override
    public void paint() {
        System.out.println("OSXButton");
    }
}

public class AbstractFactoryExample {

    @FunctionalInterface
    interface GUIFactory {
        Button createButton();
    }

    private static GUIFactory factory(String appearance) {
        switch (appearance) {
            case "osx":
                return OSXButton::new;
            case "win":
                return new GUIFactory() {
                    @Override
                    public Button createButton() {
                        return new WinButton();
                    }
                };
            default:
                throw new IllegalArgumentException("unknown "+appearance);
        }
    }

    public static void main(String[] args) {
        var randomAppearance = List.of("osx", "win").get(new Random().nextInt(2));

        var factory = factory(randomAppearance);
        var button = factory.createButton();
        button.paint();
    }
}
