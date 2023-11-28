package com.myprojects.patterns.generative.builder;

import com.myprojects.patterns.generative.prototype.Prototype;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BallpointPen implements Prototype<BallpointPen> {
    private String brand;
    private String color;
    private double tipSize;
    private boolean retractable;
    private String type;

    public BallpointPen(String brand, String color, double tipSize, boolean retractable, String type) {
        this.brand = brand;
        this.color = color;
        this.tipSize = tipSize;
        this.retractable = retractable;
        this.type = type;
    }

    private BallpointPen(BallpointPen ballpointPen) {
        this.brand = ballpointPen.getBrand();
        this.color = ballpointPen.getColor();
        this.tipSize = ballpointPen.getTipSize();
        this.retractable = ballpointPen.isRetractable();
        this.type = getType();
    }

    @Override
    public BallpointPen clone() {
        return new BallpointPen(this);
    }
}
