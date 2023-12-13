package com.myprojects.patterns.structural.adapter;

import java.util.List;
import java.util.Set;

public class AdapterApplication {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        List<Integer> array = dynamicArray.generateArray();

        for (int i = 0; i < 10; i++) {
            array.add((int) (Math.random() * (10 - 1 + 1) + 0));
        }
        System.out.println("List: " +array);

        DynamicArrayAdapter<Integer> adapter = new DynamicArrayAdapter<>(dynamicArray);
        Set<Integer> integers = adapter.generateMultiplicity();

        System.out.println("Set: " +integers);

        System.out.println("////////////////////////////////");

        DynamicMultiplicity<Integer> dynamicMultiplicity = new DynamicMultiplicity<>();
        Set<Integer> multiplicity = dynamicMultiplicity.generateMultiplicity();
        multiplicity.addAll(integers);

        DynamicMultiplicityAdapter<Integer> multiplicityAdapter = new DynamicMultiplicityAdapter<>(dynamicMultiplicity);
        List<Integer> newArray = multiplicityAdapter.generateArray();

        System.out.println("List: " +newArray);
    }
}
