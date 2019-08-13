package com.patterns.gof.structural.facade;

/**
 * @author Sergii Biliaiev
 * Created on 13/08/2019.
 */
public class Product {
    public int productId;
    public String name;

    public Product() {
    }

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }
}
