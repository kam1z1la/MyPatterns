package com.myprojects.patterns.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
public class Garden {
    private TreeFactory treeFactory;

    public Garden() {
        this.treeFactory = new TreeFactory();
    }

    public void growthTree() {
        for (int i = 0; i < 100; i++) {
            Varieties varieties = Arrays.stream(Varieties.values())
                    .skip(ThreadLocalRandom.current().nextInt(Varieties.values().length))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("Перечисление пусто"));

            Tree tree = treeFactory.getTree(varieties);
            if (tree != null) {
                tree.setLife(tree.getLife() + 1);
                tree.setHeight(tree.getHeight() + 1);
                tree.setWidth(tree.getWidth() + 1);
                log.info("Tree growth");
            }
        }
        System.out.println(treeFactory.getTrees());
    }
}
