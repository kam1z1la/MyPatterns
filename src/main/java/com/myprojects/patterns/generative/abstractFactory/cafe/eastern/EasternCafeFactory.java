package com.myprojects.patterns.generative.abstractFactory.cafe.eastern;

import com.myprojects.patterns.generative.abstractFactory.cafe.CafeFactory;
import com.myprojects.patterns.generative.abstractFactory.enums.TypeProduct;

import java.util.Optional;

public class EasternCafeFactory implements CafeFactory<Eastern> {

    @Override
    public Eastern create(TypeProduct typeProduct) {
        return Optional.of(typeProduct).map(order -> {
            switch (typeProduct) {
                case COFFEE -> { return new EasternCoffee(); }
                case TEA -> { return new EasternTea(); }
                case SWEATS -> { return new EasternSweats(); }
                default -> { return null; }
            }
        }).orElseThrow(() -> new IllegalArgumentException("No such product exists"));
    }

}
