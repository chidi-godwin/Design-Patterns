package com.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterBrowserHistory<T> implements Iterable<T>{
    private final List<T> history = new ArrayList<>();

    public void push(T url) {
        history.addLast(url);
    }

    public T pop() {
        return history.removeLast();
    }

    @Override
    public Iterator<T> iterator() {
        return new HistoryIterator();
    }

    private class HistoryIterator implements Iterator<T> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < history.size();
        }

        @Override
        public T next() {
            return history.get(index++);
        }
    }
}
