package com.myprojects.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DynamicMultiplicityAdapter<T> implements Array<T> {
    private DynamicMultiplicity<T> dynamicMultiplicity;

    public DynamicMultiplicityAdapter(DynamicMultiplicity<T> dynamicMultiplicity) {
        this.dynamicMultiplicity = dynamicMultiplicity;
    }

    @Override
    public List<T> generateArray() {
        return new ArrayList<>(dynamicMultiplicity.generateMultiplicity());
    }
}
