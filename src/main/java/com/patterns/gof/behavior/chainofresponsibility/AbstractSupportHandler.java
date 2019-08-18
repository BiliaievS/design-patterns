package com.patterns.gof.behavior.chainofresponsibility;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public abstract class AbstractSupportHandler {

    public static int TECHNICAl = 10;
    public static int BILLING = 20;
    public static int GENERAL = 30;

    protected int level;
    AbstractSupportHandler nextHandler;

    public void setNextHandler(AbstractSupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void receiveRequest(int level, String message) {
        if (this.level <= level) {
            handleRequest(message);
        }
        if (nextHandler != null) {
            nextHandler.receiveRequest(level, message);
        }
    }

    protected abstract void handleRequest(String message);
}
