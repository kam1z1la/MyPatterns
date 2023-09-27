package com.myprojects.patterns.generative.abstracktFactory.eastern;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;
import com.myprojects.patterns.generative.abstracktFactory.product.ProductFactory;
import com.myprojects.patterns.generative.abstracktFactory.product.Sweats;
import com.myprojects.patterns.generative.abstracktFactory.product.Tea;

public class EasternFactory implements ProductFactory {

    @Override
    public Coffee createCoffee() {
        return new EasternCoffee();
    }

    @Override
    public Tea createTea() {
        return new EasternTea();
    }

    @Override
    public Sweats createSweats() {
        return new EasternSweats();
    }

}
