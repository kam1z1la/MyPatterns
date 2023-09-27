package com.myprojects.patterns.generative.abstracktFactory.eastern;

import com.myprojects.patterns.generative.abstracktFactory.product.Tea;

public class EasternTea implements Tea {

    @Override
    public String orderedTea() {
        return "The client ordered Eastern tea";
    }

}
