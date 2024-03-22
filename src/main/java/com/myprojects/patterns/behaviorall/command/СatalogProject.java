package com.myprojects.patterns.behaviorall.command;

public class СatalogProject implements Command {
    private Сatalog catalog;

    public СatalogProject(Сatalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void execute() {
        catalog.showСatalogProject();
    }
}
