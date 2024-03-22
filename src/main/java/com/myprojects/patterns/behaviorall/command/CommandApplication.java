package com.myprojects.patterns.behaviorall.command;

import java.util.Scanner;

public class CommandApplication {
    private static boolean exit = false;

    public static void main(String[] args) {
        CommandInvoke invoke = new CommandInvoke();
        Сatalog catalog = new Сatalog();

        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            selectCommand(scanner, invoke, catalog);
        }
    }

    private static void selectCommand(Scanner scanner, CommandInvoke invoke, Сatalog catalog) {
        switch (scanner.nextLine()) {
            case "all" -> {
                Command com = new СatalogProject(catalog);
                invoke.execute(com);
            }
            case "command" -> {
                Command com = new CommandPatternCatalog(catalog);
                invoke.execute(com);
            }
            case "exit" -> {
                exit = true;
                scanner.close();
            }
            default -> {
                Command com = new AllComandCatalog(catalog);
                invoke.execute(com);
            }
        }
    }
}
