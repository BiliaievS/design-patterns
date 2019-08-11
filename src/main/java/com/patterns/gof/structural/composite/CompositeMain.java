package com.patterns.gof.structural.composite;

/**
 * @author Sergii Biliaiev
 * Created on 05/08/2019.
 */
public class CompositeMain {

    public static void main(String[] args) {


        CatalogComponent mJeansProduct = new Product("M: item1", 34.0);
        CatalogComponent mTShirtProduct = new Product("Z: Item2", 35.00);

        CatalogComponent newCatalog = new ProductCatalog("Female Products");
        CatalogComponent fJeans = new Product("F: Jeans 32", 65.00);
        CatalogComponent fTShirts = new Product("F: T Shirt 38", 45.00);
        newCatalog.add(fJeans);
        newCatalog.add(fTShirts);

        CatalogComponent kidCatalog = new ProductCatalog("Kids Products");
        CatalogComponent kidShorts=new Product("Return Gift", 23.00);
        CatalogComponent kidPlayGears = new Product("Summer Play Gear", 65.00);
        kidCatalog.add(kidShorts);
        kidCatalog.add(kidPlayGears);

        ProductCatalog mainCatalog = new ProductCatalog("Primary Catalog");
        mainCatalog.add(mJeansProduct);
        mainCatalog.add(mTShirtProduct);
        mainCatalog.add(newCatalog);
        mainCatalog.add(kidCatalog);

        mainCatalog.print();
    }
}
