package com.myprojects.patterns.generative.abstracktFactory;


import com.myprojects.patterns.generative.abstracktFactory.american.AmericanFactory;
import com.myprojects.patterns.generative.abstracktFactory.eastern.EasternFactory;
import com.myprojects.patterns.generative.abstracktFactory.european.EuropeanFactory;
import com.myprojects.patterns.generative.abstracktFactory.product.ProductFactory;

import java.util.Optional;

public class ProductProvider {

    public ProductFactory getFactory(TypeCafe typeCafe) {
        return Optional.of(typeCafe).map(order -> {
            switch (typeCafe) {
                case AMERICAN -> { return new AmericanFactory(); }
                case EUROPEAN -> { return new EuropeanFactory(); }
                case EASTERN -> { return new EasternFactory(); }
                default -> { return null; }
            }
        }).orElseThrow(() -> new IllegalArgumentException("No such cafe exists"));
    }

}
