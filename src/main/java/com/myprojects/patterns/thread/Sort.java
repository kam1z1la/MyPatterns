package com.myprojects.patterns.thread;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class Sort {
    List<Double> generatingOfDoubles(int size, double origin, double bound) {
        return new Random().doubles(size, origin, bound)
                .boxed()
                .collect(Collectors.toList());
    }

    List<Long> generatingOfLongs(int size, long origin, long bound) {
        return new Random().longs(size, origin, bound)
                .boxed()
                .collect(Collectors.toList());
    }

    List<Integer> generatingOfIntegers(int size, int origin, int bound) {
        return new Random().ints(size, origin, bound)
                .boxed()
                .collect(Collectors.toList());
    }

    abstract String execute();
}
