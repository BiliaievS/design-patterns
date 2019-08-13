package com.patterns.gof.structural.facade;

/**
 * @author Sergii Biliaiev
 * Created on 14/08/2019.
 */
public class OrderFulfillmentController {

    OrderServiceFacade facade;
    boolean orderFulfilled = false;

    public void orderProduct(int productId) {
        orderFulfilled = facade.placeOrder(productId);
        System.out.println("OrderFulfillmentController: Order fulfillment completed.");

    }
}
