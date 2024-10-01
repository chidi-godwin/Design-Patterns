package com.behavioural.command.editor;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private final List<Command> history = new ArrayList<>();

    public void push(Command command) {
        history.addLast(command);
    }

    public Command pop() {
        return history.removeLast();
    }
}
