package com.myprojects.patterns.generative.abstracktFactory.eastern;

import com.myprojects.patterns.generative.abstracktFactory.product.Sweets;

public class EasternSweets implements Sweets {

    @Override
    public String orderedSweets() {
        return "The client ordered Eastern sweats";
    }

}
