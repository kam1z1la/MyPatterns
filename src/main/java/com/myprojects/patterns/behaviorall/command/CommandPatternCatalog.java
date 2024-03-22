package com.myprojects.patterns.behaviorall.command;

public class CommandPatternCatalog implements Command {
    private Сatalog catalog;

    public CommandPatternCatalog(Сatalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        catalog.showСatalogProject("command");
    }
}
