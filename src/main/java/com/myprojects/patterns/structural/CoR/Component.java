package com.myprojects.patterns.structural.CoR;

public record Component(
        String type,
        long weight,
        long length,
        long width,
        double price,
        String description
) { }
