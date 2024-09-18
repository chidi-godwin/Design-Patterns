package com.behavioural.state;

public class Canvas {

    private Tool tool;

    public void mouseDown() {
        tool.mouseDown();
    }

    public void mouseUp() {
        tool.mouseUp();
    }

    public Tool getCurrentTool() {
        return tool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.tool = currentTool;
    }
}
