package com.behavioural.command.editor;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public void execute() {
        saveBackup();
        editor.replaceSelection(app.getClipboard());
    }
}
