package com.myprojects.patterns.generative.abstracktFactory.american;

import com.myprojects.patterns.generative.abstracktFactory.product.Tea;

public class AmericanTea implements Tea {

    @Override
    public String orderedTea() {
        return "The client ordered American tea";
    }

}
