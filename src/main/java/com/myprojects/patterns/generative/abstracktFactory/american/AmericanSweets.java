package com.myprojects.patterns.generative.abstracktFactory.american;

import com.myprojects.patterns.generative.abstracktFactory.product.Sweets;

public class AmericanSweets implements Sweets {

    @Override
    public String orderedSweets() {
        return "The client ordered American sweats";
    }

}
