package com.behavioural.mememto;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("This is the first content");

        history.push(editor.createState());
        editor.setContent("This is the second content");

        System.out.println(editor.getContent());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
    }
}
