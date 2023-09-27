package com.myprojects.patterns.generative.abstracktFactory.eastern;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;

public class EasternCoffee implements Coffee {

    @Override
    public String orderedCoffee() { return "The client ordered Eastern coffee"; }

}
