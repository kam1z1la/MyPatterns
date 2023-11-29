package com.myprojects.patterns.generative.builder;

public class BuilderApplication {
    public static void main(String[] args) {
        BallpointPenBuilder build = new BallpointPenBuilder();
        build.type("sdfasdf");
        build.brand("sdfasdf");
        BallpointPen pen = build.build();

        pen.setType("asfadfas");
        System.out.println(build);
        System.out.println("///////////////////////////////////////////");

        System.out.println(pen);
        System.out.println("///////////////////////////////////////////");
        System.out.println(build);

    }
}
