package com.myprojects.patterns.generative.builder;

public interface Builder {
    BallpointPen build();
    void brand(String brand);
    void color(String color);
    void tipSize(double tipSize);
    void retractable(boolean retractable);
    void type(String type);
}
