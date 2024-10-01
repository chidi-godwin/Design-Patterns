package com.behavioural.command.editor;

import com.behavioural.mememto.History;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private String clipboard;
    private final List<Editor> editors = new ArrayList<>();
    private Editor activeEditor;
    private CommandHistory history;


    public void setClipBoard(String selection) {
        clipboard = selection;
    }

    public int openNewEditor() {
        editors.add(new Editor());
        int pos = editors.size() - 1;
        setActiveEditor(pos);
        return pos;
    }
    public void closeEditor(Editor editor) {
        editors.remove(editor);
    }

    public void setActiveEditor(int index) {
        activeEditor = editors.get(index);
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void executeCommand(Command command) {
        if (command != null)
            command.execute();
    }

    public void undo() {
        var prevCommand = history.pop();
        if (prevCommand != null)
            prevCommand.undo();
    }
}
