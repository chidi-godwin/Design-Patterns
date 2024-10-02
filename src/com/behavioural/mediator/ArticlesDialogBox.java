package com.behavioural.mediator;

public class ArticlesDialogBox {
    private final Button saveButton = new Button();
    private final TextBox titleTextBox = new TextBox();
    private final ListBox articleListBox = new ListBox();

    public ArticlesDialogBox() {
        articleListBox.addEvents(this::articleSelected);
        titleTextBox.addEvents(this::titleChanged);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
    }
}
