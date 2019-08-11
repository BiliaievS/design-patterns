package com.patterns.gof.structural.composite;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent component) {
        throw new UnsupportedOperationException("Cannot add item to catalog.");
    }

    public void remove(CatalogComponent component) {
        throw new UnsupportedOperationException("Cannot remove item from catalog.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Cannot return name.");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Cannot return price.");
    }

    public void print() {
        throw new UnsupportedOperationException("Cannot print.");
    }
}
