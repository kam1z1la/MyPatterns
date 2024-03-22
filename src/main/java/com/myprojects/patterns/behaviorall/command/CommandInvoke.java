package com.myprojects.patterns.behaviorall.command;

import java.util.LinkedList;
import java.util.List;

public class CommandInvoke {
    private List<Command> commands = new LinkedList<>();

    public void execute(Command command) {
        commands.add(command);
        command.execute();
    }
}
