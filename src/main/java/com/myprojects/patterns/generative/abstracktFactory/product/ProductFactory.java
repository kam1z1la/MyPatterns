package com.myprojects.patterns.generative.abstracktFactory.product;

public interface ProductFactory {
    Coffee createCoffee();
    Tea createTea();
    Sweets createSweats();
}
