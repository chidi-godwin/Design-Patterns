package com.behavioural.observer.spreadsheet;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart got notified with value " + value);
    }
}
