package com.myprojects.patterns.generative.abstracktFactory.european;

import com.myprojects.patterns.generative.abstracktFactory.product.Tea;

public class EuropeanTea implements Tea {

    @Override
    public String orderedTea() {
        return "The client ordered European tea";
    }

}
