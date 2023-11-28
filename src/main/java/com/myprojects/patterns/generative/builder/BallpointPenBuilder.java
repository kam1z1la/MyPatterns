package com.myprojects.patterns.generative.builder;

public class BallpointPenBuilder implements Builder {
    private String brand;
    private String color;
    private double tipSize;
    private boolean retractable;
    private String type;

    @Override
    public BallpointPen build() {
        return new BallpointPen(brand, color, tipSize, retractable, type);
    }

    @Override
    public Builder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Builder tipSize(double tipSize) {
        this.tipSize = tipSize;
        return this;
    }

    @Override
    public Builder retractable(boolean retractable) {
        this.retractable = retractable;
        return this;
    }

    @Override
    public Builder type(String type) {
        this.type = type;
        return this;
    }
}
