package com.myprojects.patterns.generative.abstracktFactory.american;

import com.myprojects.patterns.generative.abstracktFactory.product.Sweats;

public class AmericanSweats implements Sweats {

    @Override
    public String orderedSweats() {
        return "The client ordered American sweats";
    }

}
