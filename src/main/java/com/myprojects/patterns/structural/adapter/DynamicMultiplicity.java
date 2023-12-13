package com.myprojects.patterns.structural.adapter;

import java.util.HashSet;
import java.util.Set;

public class DynamicMultiplicity<T> implements Multiplicity<T> {
    private Set<T> multiplicity;
    @Override
    public Set<T> generateMultiplicity() {
        return multiplicity == null? multiplicity = new HashSet<>() : multiplicity;
    }
}
