package com.patterns.gof.structural.facade;

/**
 * @author Sergii Biliaiev
 * Created on 14/08/2019.
 */
public class OrderServiceFacadeImpl implements OrderServiceFacade {

    @Override
    public boolean placeOrder(int productId) {
        boolean orderFulfilled = false;
        Product product = new Product();
        product.productId = productId;
        if (InventoryService.isAvailable(product)) {
            System.out.println("Product with id: " + product.productId + " is available.");
            boolean payment = PaymentService.makePayment();
            if (payment) {
                System.out.println("Payment confirmed.");
                ShippingService.shipProduct(product);
                System.out.println("Product shipped.");
                orderFulfilled = true;
            }
        }
        return orderFulfilled;
    }
}
