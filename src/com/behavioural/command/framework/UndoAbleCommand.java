package com.behavioural.command.framework;

public interface UndoAbleCommand extends Command {
    void unexecute();
}
