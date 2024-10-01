package com.behavioural.command.document;

import com.behavioural.command.framework.UndoAbleCommand;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<UndoAbleCommand> actions = new ArrayList<>();

    public void push(UndoAbleCommand command) {
        actions.addLast(command);
    }

    public UndoAbleCommand pop() {
        return actions.removeLast();
    }
}
