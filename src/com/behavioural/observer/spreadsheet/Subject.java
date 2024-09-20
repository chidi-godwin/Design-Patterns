package com.behavioural.observer.spreadsheet;

import java.util.List;
import java.util.ArrayList;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(int value) {
        for (var observer: observers)
            observer.update(value);
    }
}
