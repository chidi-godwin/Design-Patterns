package com.behavioural.command.customer;

import com.behavioural.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White") ;
    }
}
