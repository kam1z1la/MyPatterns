package com.myprojects.patterns.generative.abstracktFactory.american;

import com.myprojects.patterns.generative.abstracktFactory.product.Coffee;

public class AmericanCoffee implements Coffee {

    @Override
    public String orderedCoffee() { return "The client ordered American coffee"; }

}
