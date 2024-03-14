package com.myprojects.patterns.structural.decorator;

public class OakTreeDecorator extends TreeDecorator {

    public OakTreeDecorator(Tree tree) {
        super(tree);
    }

    @Override
    public String grown() {
        return oakTreePlan(super.grown());
    }

    private String oakTreePlan(String oakTree) {
        return oakTree + ", add string from OakTreeDecorator";
    }
}
