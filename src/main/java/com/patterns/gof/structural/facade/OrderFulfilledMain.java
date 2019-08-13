package com.patterns.gof.structural.facade;

/**
 * @author Sergii Biliaiev
 * Created on 14/08/2019.
 */
public class OrderFulfilledMain {

    public static void main(String[] args) {
        OrderFulfillmentController controller = new OrderFulfillmentController();
        controller.facade = new OrderServiceFacadeImpl();
        controller.orderProduct(8);
        boolean res = controller.orderFulfilled;
        System.out.println(res);
    }
}
