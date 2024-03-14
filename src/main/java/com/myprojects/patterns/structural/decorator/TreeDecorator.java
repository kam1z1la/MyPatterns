package com.myprojects.patterns.structural.decorator;

public class TreeDecorator implements Tree {
    private final Tree tree;

    public TreeDecorator(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String grown() {
        return tree.grown();
    }
}
