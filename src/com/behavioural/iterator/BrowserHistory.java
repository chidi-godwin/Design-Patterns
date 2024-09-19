package com.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private final List<String> history = new ArrayList<>();

    public void push(String url) {
        history.addLast(url);
    }

    public String pop() {
        if (history.isEmpty())
            return null;

        return history.removeLast();
    }

    public Iterator<String> iterator() {
        return new ListIterator(this);
    }

    private static class ListIterator implements Iterator<String> {
        private int index;

        private final BrowserHistory browserHistory;

        public ListIterator(BrowserHistory history) {
            this.browserHistory = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean hasNext() {
            return index < browserHistory.history.size();
        }

        @Override
        public String current() {
            return browserHistory.history.get(index);
        }
    }
}
