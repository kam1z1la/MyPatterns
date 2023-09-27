package com.myprojects.patterns.generative.abstracktFactory.european;

import com.myprojects.patterns.generative.abstracktFactory.product.Sweats;

public class EuropeanSweats implements Sweats {

    @Override
    public String orderedSweats() {
        return "The client ordered European sweats";
    }

}
