package com.behavioural.command.framework;

public class Button {
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    private String label;

    public void click() {
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
