package com.myprojects.patterns.thread;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InsertionSort extends Sort {
    private List<Integer> list;

    public InsertionSort(int size, int origin, int bound) {
        this.list = new ArrayList<>(generatingOfIntegers(size, origin, bound));
    }

    @Override
    List<Integer> generatingOfIntegers(int size, int origin, int bound) {
        return super.generatingOfIntegers(size, origin, bound);
    }

    @Override
    String execute() {
        for (int j = 1; j < list.size(); j++) {
            int key = list.get(j);
            int i = j - 1;
            while ((i > -1) && (list.get(i) > key)) {
                list.set(i + 1, list.get(i));
                i--;
            }
            list.set(i + 1, key);
        }
        return list.toString();
    }
}
