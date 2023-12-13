package com.myprojects.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray<T> implements Array<T> {
    private List<T> array;

    @Override
    public List<T> generateArray() {
        return array == null? array = new ArrayList<>() : array;
    }
}
