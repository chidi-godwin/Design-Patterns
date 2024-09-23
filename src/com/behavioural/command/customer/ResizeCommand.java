package com.behavioural.command.customer;

import com.behavioural.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing");
    }
}
