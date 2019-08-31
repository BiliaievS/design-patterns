package com.patterns.gof.behavior.observer;

import java.math.BigDecimal;

/**
 * @author Sergii Biliaiev
 * Created on 30/08/2019.
 */
public class ObserverMain {
    public static void main(String[] args) {
        Subject product = new Product("36 LED TV", new BigDecimal(200));
        Observer alex = new Bidder("Alex");
        Observer smith = new Bidder("Smith");
        Observer vincent = new Bidder("Vincent");

        product.registerObserver(alex);
        product.registerObserver(smith);
        product.registerObserver(vincent);

        product.setBidAmount(alex, new BigDecimal(300));
        product.removeObserver(smith);
        product.setBidAmount(alex, new BigDecimal(350));

        System.out.println("\n----------Observer JavaApi----------\n");

        ProductJava camera = new ProductJava("L220 Mitsubishi camera", new BigDecimal(370));
        BidderJava fergusonBidder = new BidderJava("Ferguson");
        BidderJava poloBidder = new BidderJava("Polo");
        BidderJava sunnyBidder = new BidderJava("Sunny");

        camera.addObserver(fergusonBidder);
        camera.addObserver(poloBidder);
        camera.addObserver(sunnyBidder);

        camera.setBid(fergusonBidder, new BigDecimal(350));
        camera.setBid(fergusonBidder, new BigDecimal(380));
        camera.deleteObserver(sunnyBidder);
        camera.setBid(sunnyBidder, new BigDecimal(390));
    }
}
