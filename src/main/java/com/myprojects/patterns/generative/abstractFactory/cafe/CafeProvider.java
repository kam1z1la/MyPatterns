package com.myprojects.patterns.generative.abstractFactory.cafe;

import com.myprojects.patterns.generative.abstractFactory.cafe.american.AmericanCafeFactory;
import com.myprojects.patterns.generative.abstractFactory.cafe.eastern.EasternCafeFactory;
import com.myprojects.patterns.generative.abstractFactory.cafe.european.EuropeanCafeFactory;
import com.myprojects.patterns.generative.abstractFactory.enums.TypeCafe;

import java.util.Optional;

public class CafeProvider {

    public CafeFactory<?> createFactory(TypeCafe typeCafe) {
        return Optional.of(typeCafe).map(order -> {
            switch (typeCafe) {
                case AMERICAN -> { return new AmericanCafeFactory(); }
                case EASTERN -> { return new EasternCafeFactory(); }
                case EUROPEAN -> { return new EuropeanCafeFactory(); }
                default -> { return null; }
            }
        }).orElseThrow(() -> new IllegalArgumentException("No such cafe exists"));
    }

}
