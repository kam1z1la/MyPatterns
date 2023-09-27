package com.myprojects.patterns.generative.abstracktFactory.eastern;

import com.myprojects.patterns.generative.abstracktFactory.product.Sweats;

public class EasternSweats implements Sweats {

    @Override
    public String orderedSweats() {
        return "The client ordered Eastern sweats";
    }

}
