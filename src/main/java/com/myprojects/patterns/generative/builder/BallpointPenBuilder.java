package com.myprojects.patterns.generative.builder;

public class BallpointPenBuilder implements Builder {
    private BallpointPen ballpointPen;

    public BallpointPenBuilder() {
        this.ballpointPen = new BallpointPen();
    }

    @Override
    public void brand(String brand) {
        ballpointPen.setBrand(brand);
    }

    @Override
    public void color(String color) {
        ballpointPen.setColor(color);
    }

    @Override
    public void tipSize(double tipSize) {
        ballpointPen.setTipSize(tipSize);
    }

    @Override
    public void retractable(boolean retractable) {
        ballpointPen.setRetractable(retractable);
    }

    @Override
    public void type(String type) {
        ballpointPen.setType(type);
    }

    @Override
    public BallpointPen build() {
        return ballpointPen;
    }
}
