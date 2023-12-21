package com.myprojects.patterns.structural.flyweight;

import lombok.*;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TreeType {
    private int maxLife;
    private String color;
    private Varieties varieties;

    public TreeType createType(Varieties varieties) {
        return TreeType.builder()
                .color("Green")
                .maxLife(varieties.getMaxLife())
                .varieties(varieties)
                .build();
    }
}
