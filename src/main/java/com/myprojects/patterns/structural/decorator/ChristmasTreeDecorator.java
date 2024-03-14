package com.myprojects.patterns.structural.decorator;

public class ChristmasTreeDecorator extends TreeDecorator {

    public ChristmasTreeDecorator(Tree tree) {
        super(tree);
    }

    @Override
    public String grown() {
        return christmasTreePlan(super.grown());
    }

    private String christmasTreePlan(String christmasTree) {
        return christmasTree + ", add string from ChristmasTreeDecorator";
    }
}
