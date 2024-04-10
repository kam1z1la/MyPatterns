package com.myprojects.patterns.thread;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BubbleSort extends Sort {
    private List<Double> list;

    public BubbleSort(int size, double origin, double bound) {
        this.list = new ArrayList<>(generatingOfDoubles(size, origin, bound));
    }

    @Override
    List<Double> generatingOfDoubles(int size, double origin, double bound) {
        return super.generatingOfDoubles(size, origin, bound);
    }

    @Override
    String execute() {
        int n = list.size();
        double temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list.get(j-1) > list.get(j)){
                    temp = list.get(j-1);
                    list.set(j-1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list.toString();
    }
}
