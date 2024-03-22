package com.myprojects.patterns.behaviorall.command;


public class AllComandCatalog implements Command {
    private Сatalog catalog;

    public AllComandCatalog(Сatalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        catalog.showAllComand();
    }
}
