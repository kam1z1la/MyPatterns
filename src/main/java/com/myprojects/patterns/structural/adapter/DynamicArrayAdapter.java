package com.myprojects.patterns.structural.adapter;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class DynamicArrayAdapter<T> implements Multiplicity<T> {
    private DynamicArray<T>  dynamicArray;

    public DynamicArrayAdapter(DynamicArray<T> dynamicArray) {
        this.dynamicArray = dynamicArray;
    }

    @Override
    public Set<T> generateMultiplicity() {
        return new HashSet<>(dynamicArray.generateArray());
    }
}
