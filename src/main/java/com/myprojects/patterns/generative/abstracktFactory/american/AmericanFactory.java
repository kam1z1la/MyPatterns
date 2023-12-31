package com.myprojects.patterns.generative.abstracktFactory.american;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;
import com.myprojects.patterns.generative.abstracktFactory.product.ProductFactory;
import com.myprojects.patterns.generative.abstracktFactory.product.Sweets;
import com.myprojects.patterns.generative.abstracktFactory.product.Tea;

public class AmericanFactory implements ProductFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Tea createTea() {
        return new AmericanTea();
    }

    @Override
    public Sweets createSweats() {
        return new AmericanSweets();
    }

}
