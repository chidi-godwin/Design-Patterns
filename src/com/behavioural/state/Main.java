package com.behavioural.state;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        var selectionTool = new SelectionTool();
        var eraserTool = new EraserTool();

        canvas.setCurrentTool(selectionTool);
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(eraserTool);
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
