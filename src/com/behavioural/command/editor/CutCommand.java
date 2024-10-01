package com.behavioural.command.editor;

public class CutCommand extends Command {
    private final int begin;
    private final int end;

    public CutCommand(Application app, Editor editor, int begin, int end) {
        super(app, editor);
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void execute() {
        saveBackup();
        editor.setSelection(begin, end);
        app.setClipBoard(editor.getSelection());
        editor.deleteSelection();
    }
}
