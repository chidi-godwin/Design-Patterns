package com.behavioural.command;

import com.behavioural.command.customer.*;
import com.behavioural.command.editor.Application;
import com.behavioural.command.framework.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.click();

        System.out.println("\nExample with Composite Commands\n ");

        var commands = new CompositeCommand();
        commands.add(new ResizeCommand());
        commands.add(new BlackAndWhiteCommand());
        commands.execute();
        commands.execute();

        var app = new Application();
        int currentEditor = app.openNewEditor();

    }
}
