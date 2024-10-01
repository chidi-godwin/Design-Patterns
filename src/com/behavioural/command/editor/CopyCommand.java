package com.behavioural.command.editor;

public class CopyCommand extends Command {

    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        app.setClipBoard(editor.getSelection());
    }
}
