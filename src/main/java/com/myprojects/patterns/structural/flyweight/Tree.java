package com.myprojects.patterns.structural.flyweight;

import lombok.*;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Tree {
    private int x;
    private int y;
    private float width;
    private float height;
    private int life;
    private TreeType type;

    public Tree createTree(Varieties varieties) {
        return Tree.builder()
                .x((int) (Math.random() * 100))
                .y((int) (Math.random() * 100))
                .width(0)
                .height(0)
                .life(0)
                .type(new TreeType().createType(varieties))
                .build();
    }
}