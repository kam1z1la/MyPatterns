package com.myprojects.patterns.behaviorall.strategy;

public class Context {
    private final Document document;

    public Context(Document document) {
        this.document = document;
    }

    public void createFile(String path) {
        document.create(path);
    }
}
