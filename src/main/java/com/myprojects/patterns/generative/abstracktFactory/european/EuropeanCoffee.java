package com.myprojects.patterns.generative.abstracktFactory.european;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;

public class EuropeanCoffee implements Coffee {

    @Override
    public String orderedCoffee() { return "The client ordered European coffee"; }

}
