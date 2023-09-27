package com.myprojects.patterns.generative.abstracktFactory;

import com.myprojects.patterns.generative.abstracktFactory.product.ProductFactory;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        ProductFactory factory = new ProductProvider().getFactory(TypeCafe.AMERICAN);
        System.out.println(factory.createCoffee().orderedCoffee());
    }

}

