package com.myprojects.patterns.structural.adapter;

import java.util.Set;

public interface Multiplicity<T> {
    Set<T> generateMultiplicity();
}
