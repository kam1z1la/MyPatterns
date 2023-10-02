package com.myprojects.patterns.generative.abstracktFactory.eastern;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;
import com.myprojects.patterns.generative.abstracktFactory.product.ProductFactory;
import com.myprojects.patterns.generative.abstracktFactory.product.Sweets;
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
    public Sweets createSweats() {
        return new EasternSweets();
    }

}
