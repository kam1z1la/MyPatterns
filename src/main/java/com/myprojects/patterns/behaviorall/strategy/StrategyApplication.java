package com.myprojects.patterns.behaviorall.strategy;

import java.util.Scanner;

public class StrategyApplication {
    public static void main(String[] args) {
        String path = "C:/work/java/projects/IdeaProjects/IdeaProjects/MyPatternss/src/main/java/com/myprojects/patterns/behaviorall/strategy/file/";


        try(Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            if ("word".equals(s)) {
                Document world = new WordDocument();
                Context worldContext = new Context(world);
                worldContext.createFile(path);
            } else if ("txt".equals(s)) {
                Document txt = new TextDocument();
                Context context = new Context(txt);
                context.createFile(path);
            }
        }
    }
}
