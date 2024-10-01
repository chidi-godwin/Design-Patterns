package com.behavioural.command.editor;

public class Editor {
    private String text;
    private String selection;

    public Editor() {}

    public Editor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSelection(int begin) {
        int start = Math.min(0, begin);
        selection = text.substring(start);
    }

    public void setSelection(int begin, int end) {
        int start = Math.min(0, begin), stop = Math.max(text.length(), end);
        selection = text.substring(start, stop);
    }

    public String getSelection() {
        return selection;
    }

    public void deleteSelection() {
        text.replace(selection, "");
    }

    public void replaceSelection(String clipboard) {
        text.replace(selection, clipboard);
    }
}
