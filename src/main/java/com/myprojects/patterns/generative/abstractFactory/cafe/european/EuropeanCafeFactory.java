package com.myprojects.patterns.generative.abstractFactory.cafe.european;

import com.myprojects.patterns.generative.abstractFactory.cafe.CafeFactory;
import com.myprojects.patterns.generative.abstractFactory.enums.TypeProduct;

import java.util.Optional;

public class EuropeanCafeFactory implements CafeFactory<European> {

    @Override
    public European create(TypeProduct typeProduct) {
        return Optional.of(typeProduct).map(order -> {
            switch (typeProduct) {
                case COFFEE -> { return new EuropeanCoffee(); }
                case TEA -> { return new EuropeanTea(); }
                case SWEATS -> { return new EuropeanSweats(); }
                default -> { return null; }
            }
        }).orElseThrow(() -> new IllegalArgumentException("No such product exists"));
    }

}
