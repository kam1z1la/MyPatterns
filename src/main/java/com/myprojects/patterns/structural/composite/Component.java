package com.myprojects.patterns.structural.composite;

public record Component(
        long weight,
        long length,
        long width,
        double price,
        String description
) implements Airplane {
    @Override
    public long getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
