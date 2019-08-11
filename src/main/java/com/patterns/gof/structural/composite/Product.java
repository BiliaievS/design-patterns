package com.patterns.gof.structural.composite;

/**
 * @author Sergii Biliaiev
 * Created on 05/08/2019.
 */
public class Product extends CatalogComponent {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.printf("Product name: %s, Price: %s%n", name, price);
    }
}
