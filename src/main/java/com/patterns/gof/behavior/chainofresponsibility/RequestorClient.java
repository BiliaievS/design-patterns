package com.patterns.gof.behavior.chainofresponsibility;

import static com.patterns.gof.behavior.chainofresponsibility.AbstractSupportHandler.*;

/**
 * @author Sergii Biliaiev
 * Created on 18/08/2019.
 */
public class RequestorClient {

    public static AbstractSupportHandler getHandlerChain() {

        AbstractSupportHandler technicalHandler = new TechnicalSupportHandler(TECHNICAl);
        AbstractSupportHandler billingHandler = new BillingSupportHandler(BILLING);
        AbstractSupportHandler generalHandler = new GeneralSupportHandler(GENERAL);

        technicalHandler.setNextHandler(billingHandler);
        billingHandler.setNextHandler(generalHandler);
        return technicalHandler;
    }


}
