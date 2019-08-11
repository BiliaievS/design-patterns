package com.patterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergii Biliaiev
 * Created on 05/08/2019.
 */
public class ProductCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent component) {
        items.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        items.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        items.forEach(CatalogComponent::print);
    }
}
