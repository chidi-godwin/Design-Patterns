package com.behavioural.command;

import com.behavioural.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private final List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        this.commands.add(command);
    }

    @Override
    public void execute() {
        for (var command: commands)
            command.execute();
    }

}
