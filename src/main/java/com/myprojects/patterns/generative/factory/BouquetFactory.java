package com.myprojects.patterns.generative.factory;

import java.util.Optional;

public class BouquetFactory {

    public Bouquet createBouquet(Events event) {
        return Optional.of(event).map(order -> {
            switch (event) {
                case WEDDING -> { return new WeddingBouquet(); }
                case BIRTHDAY -> { return new BirthdayBouquet(); }
                case JUBILEE -> { return new JubileeBouquet(); }
                case GRADUATION -> { return new GraduationBouquet(); }
                default -> { return null; }
            }
        }).orElseThrow(() -> new IllegalArgumentException("No such events exists"));
    }

}
