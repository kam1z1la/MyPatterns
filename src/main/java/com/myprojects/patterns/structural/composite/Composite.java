package com.myprojects.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Composite implements Airplane {
    private List<Airplane> airplanes;

    public Composite() {
        this.airplanes = new ArrayList<>();
    }

    public void addComponent(Airplane component) {
        airplanes.add(component);
    }

    public void removeComponent(Airplane component) {
        airplanes.remove(component);
    }

    @Override
    public long getWeight() {
        return airplanes.stream()
                .mapToLong(Airplane::getWeight)
                .sum();
    }

    @Override
    public double getPrice() {
        return airplanes.stream()
                .mapToDouble(Airplane::getPrice)
                .sum();
    }
}
