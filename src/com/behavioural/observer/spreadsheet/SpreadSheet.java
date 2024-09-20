package com.behavioural.observer.spreadsheet;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified with value " + value);
    }
}
