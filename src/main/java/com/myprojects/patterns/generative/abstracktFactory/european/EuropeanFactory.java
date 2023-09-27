package com.myprojects.patterns.generative.abstracktFactory.european;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;
import com.myprojects.patterns.generative.abstracktFactory.product.ProductFactory;
import com.myprojects.patterns.generative.abstracktFactory.product.Sweats;
import com.myprojects.patterns.generative.abstracktFactory.product.Tea;

public class EuropeanFactory implements ProductFactory {

    @Override
    public Coffee createCoffee() {
        return new EuropeanCoffee();
    }

    @Override
    public Tea createTea() {
        return new EuropeanTea();
    }

    @Override
    public Sweats createSweats() {
        return new EuropeanSweats();
    }

}
