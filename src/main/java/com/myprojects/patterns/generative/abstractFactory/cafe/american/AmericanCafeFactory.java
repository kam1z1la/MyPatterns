package com.myprojects.patterns.generative.abstractFactory.cafe.american;

import com.myprojects.patterns.generative.abstractFactory.cafe.CafeFactory;
import com.myprojects.patterns.generative.abstractFactory.enums.TypeProduct;

import java.util.Optional;

public class AmericanCafeFactory implements CafeFactory<American> {

    @Override
    public American create(TypeProduct typeProduct) {
        return Optional.of(typeProduct).map(order -> {
            switch (typeProduct) {
                case COFFEE -> { return new AmericanCoffee(); }
                case TEA -> { return new AmericanTea(); }
                case SWEATS -> { return new AmericanSweats(); }
                default -> { return null; }
            }
        }).orElseThrow(() -> new IllegalArgumentException("No such product exists"));
    }

}
