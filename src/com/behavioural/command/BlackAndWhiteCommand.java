package com.behavioural.command;

import com.behavioural.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White") ;
    }
}
