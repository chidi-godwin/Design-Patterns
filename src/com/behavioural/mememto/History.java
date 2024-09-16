package com.behavioural.mememto;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<EditorState> states;
    public History() {
        states = new ArrayDeque<>();
    }

    public void push(EditorState state) {
        states.addLast(state);
    }

    public EditorState pop() {
        return states.pollLast();
    }
}
