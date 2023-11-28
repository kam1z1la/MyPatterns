package com.myprojects.patterns.generative.builder;

public interface Builder {
    BallpointPen build();
    Builder brand(String brand);
    Builder color(String color);
    Builder tipSize(double tipSize);
    Builder retractable(boolean retractable);
    Builder type(String type);
}
