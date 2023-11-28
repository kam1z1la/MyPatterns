package com.myprojects.patterns.generative.builder;

public class BuilderApplication {
    public static void main(String[] args) {
        BallpointPen build = new BallpointPenBuilder()
                .type("asf")
                .retractable(true)
                .build();

        BallpointPen pen = build.clone();

        pen.setType("asfadfas");

        System.out.println(pen);
        System.out.println(build);
    }
}
