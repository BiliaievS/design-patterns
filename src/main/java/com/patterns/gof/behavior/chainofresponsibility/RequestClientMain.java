package com.patterns.gof.behavior.chainofresponsibility;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class RequestClientMain {
    public static void main(String[] args) {
        AbstractSupportHandler handlerChain = RequestorClient.getHandlerChain();

        handlerChain.receiveRequest(AbstractSupportHandler.TECHNICAl, "Problem with my internet connectivity.");
        System.out.println("...............................");

        handlerChain.receiveRequest(AbstractSupportHandler.BILLING, "Please resend my bill for this month");
        System.out.println("...............................");

        handlerChain.receiveRequest(AbstractSupportHandler.GENERAL, "PLease send any other plans for home users.");
        System.out.println("...............................");
    }
}
