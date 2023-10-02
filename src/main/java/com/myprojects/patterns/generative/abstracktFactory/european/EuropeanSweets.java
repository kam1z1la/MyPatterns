package com.myprojects.patterns.generative.abstracktFactory.european;

import com.myprojects.patterns.generative.abstracktFactory.product.Sweets;

public class EuropeanSweets implements Sweets {

    @Override
    public String orderedSweets() {
        return "The client ordered European sweats";
    }

}
