package com.myprojects.patterns.generative.builder;

import com.myprojects.patterns.generative.prototype.Clonelable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BallpointPen implements Clonelable<BallpointPen> {
    private String brand;
    private String color;
    private double tipSize;
    private boolean retractable;
    private String type;

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
