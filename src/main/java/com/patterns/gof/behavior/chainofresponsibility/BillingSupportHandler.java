package com.patterns.gof.behavior.chainofresponsibility;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class BillingSupportHandler extends AbstractSupportHandler {

    public BillingSupportHandler(int level) {
        this.level = level;
    }

    @Override
    protected void handleRequest(String message) {
        System.out.println(BillingSupportHandler.class.getName() + ": Processing request " + message);
    }
}
