package com.behavioural.command.document;

import com.behavioural.command.framework.UndoAbleCommand;

public class BoldCommand implements UndoAbleCommand {
    private String prevContent;
    private final Document document;

    public BoldCommand(Document document, History history) {
        this.document = document;
    }

    @Override
    public void execute() {
        var content = document.getContent();
        prevContent = content;
        document.setContent("<b> " + content + " </b>");
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
