package com.behavioural.command;

import com.behavioural.command.fx.Command;

public class AddCustomerCommand implements Command {
    private final CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        this.service.addCustomer();
    }
}
