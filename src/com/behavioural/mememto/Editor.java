package com.behavioural.mememto;
public class Editor {
    private String content;

    private String title;

    public Editor() {
        this.content = "";
        this.title = "";
    }

    public Editor(String content) {
        this.content = content;
    }

    public Editor(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
         return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public EditorState createState() {
        return new EditorState(content, title);
    }

    public void restoreState(EditorState state) {
        content = state.content();
        title = state.title();
    }
}
