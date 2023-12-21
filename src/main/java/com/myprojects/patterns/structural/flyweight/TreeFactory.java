package com.myprojects.patterns.structural.flyweight;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
public class TreeFactory {
    private Map<Varieties, Tree> trees;

    public TreeFactory() {
        this.trees = new HashMap<>();
    }

    public Tree getTree(Varieties varieties) {
        Tree tree = trees.get(varieties);
        if (tree == null) {
            Tree newTree = new Tree().createTree(varieties);
            trees.put(varieties, newTree);
            log.warn("The object was created");
        }
        log.info("Object obtained from hash");
        return tree;
    }
}
