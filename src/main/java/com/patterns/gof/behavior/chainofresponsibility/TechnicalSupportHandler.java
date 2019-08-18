package com.patterns.gof.behavior.chainofresponsibility;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class TechnicalSupportHandler extends AbstractSupportHandler {

    public TechnicalSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println(TechnicalSupportHandler.class.getName() + ": Processing request " + message);
    }
}
