package com.patterns.gof.behavior.chainofresponsibility;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class GeneralSupportHandler extends AbstractSupportHandler {

    public GeneralSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println(GeneralSupportHandler.class.getName() + ": Processing request " + message);
    }
}
