package com.myprojects.patterns.structural.decorator;

public class DecoratorApplication {
    public static void main(String[] args) {
        Tree christmasTree = new ChristmasTree();
        System.out.println(christmasTree.grown());

        TreeDecorator decoratorApplication = new ChristmasTreeDecorator(christmasTree);
        System.out.println(decoratorApplication.grown());

        Tree oakTree = new OakTree();
        System.out.println(oakTree.grown());

        TreeDecorator oakTreeDecorator = new OakTreeDecorator(oakTree);
        System.out.println(oakTreeDecorator.grown());

        TreeDecorator tree1 = new OakTreeDecorator(oakTreeDecorator);
        System.out.println(tree1.grown());
    }
}

