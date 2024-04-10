package com.myprojects.patterns.thread;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SelectionSort extends Sort {
    private List<Long> list;

    public SelectionSort(int size, long origin, long bound) {
        this.list = new ArrayList<>(generatingOfLongs(size, origin,bound));
    }

    @Override
    List<Long> generatingOfLongs(int size, long origin, long bound) {
        return super.generatingOfLongs(size, origin, bound);
    }

    @Override
    String execute() {
        for (int i = 0; i < list.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(j) < list.get(index)){
                    index = j;
                }
            }
            long smallerNumber = list.get(index);
            list.set(index, list.get(i));
            list.set(i,smallerNumber);
        }
        return list.toString();
    }
}
