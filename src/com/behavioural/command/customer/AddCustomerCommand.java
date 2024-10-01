package com.behavioural.command.customer;

import com.behavioural.command.framework.Command;

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
