package com.myprojects.patterns.behaviorall.strategy;

public class StrategyApplication {
    public static void main(String[] args) {
        String path = "C:/work/java/projects/IdeaProjects/IdeaProjects/MyPatternss/src/main/java/com/myprojects/patterns/behaviorall/strategy/file/";

        Document txt = new TextDocument();
        Context context = new Context(txt);
        context.createFile(path);

        Document world = new WordDocument();
        Context worldContext = new Context(world);
        worldContext.createFile(path);

        Document rtf = new RichTextFormatDocument();
        Context contextRTF = new Context(rtf);
        contextRTF.createFile(path);
    }
}
